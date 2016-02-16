package com.cheng.weixin.web.security;

import com.cheng.weixin.core.utils.WXStringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Author: Cheng
 * Date: 2016/1/27 0027
 */
public class WxFormAuthenticationFilter extends FormAuthenticationFilter {

    Logger log = LoggerFactory.getLogger(WxFormAuthenticationFilter.class);

    public static final String DEFAULT_CAPTCHA_PARAM = "captcha";
    public static final String DEFAULT_MOBILE_PARAM = "mobileLogin";
    public static final String DEFAULT_MESSAGE_PARAM = "message";

    private String captchaParam = DEFAULT_CAPTCHA_PARAM;
    private String mobileLoginParam = DEFAULT_MOBILE_PARAM;
    private String messageParam = DEFAULT_MESSAGE_PARAM;

    @Override
    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {
        String username = getUsername(request);
        String password = getPassword(request);
        if(password==null) {
            password="";
        }
        boolean rememberMe = isRememberMe(request);
        String host = WXStringUtils.getRemoteAddr((HttpServletRequest) request);
        String captcha = getCaptcha(request);
        boolean mobile = isMobileLogin(request);

        return new WxUsernamePasswordToken(username, password.toCharArray(), rememberMe, host, mobile, captcha);
    }
    // 获取验证码
    protected String getCaptcha(ServletRequest request) {
        return WebUtils.getCleanParam(request, getCaptchaParam());
    }
    protected boolean isMobileLogin(ServletRequest request) {
        return WebUtils.isTrue(request, getMobileLoginParam());
    }
    public String getMessageParam() {
        return messageParam;
    }
    public String getMobileLoginParam() {
        return mobileLoginParam;
    }
    public String getCaptchaParam() {
        return captchaParam;
    }

    @Override
    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e,
                                     ServletRequest request, ServletResponse response) {
        String className = e.getClass().getName();
        String message = "";
        if(IncorrectCredentialsException.class.getName().equals(className)
                || UnknownAccountException.class.getName().equals(className)) {
            message = "用户名或密码错误！";
        }else if (e.getMessage() != null && WXStringUtils.startsWith(e.getMessage(), "msg:")) {
            message = WXStringUtils.replace(e.getMessage(), "msg:", "");
        }else {
            message = "系统除了点问题请稍后再试！";
            log.error("发生错误{}", e.getMessage());
            e.printStackTrace();
        }
        request.setAttribute(getFailureKeyAttribute(), className);// 前台可以显现这些错误
        request.setAttribute(getMessageParam(), message);// 用户提醒
        return true;
    }
}

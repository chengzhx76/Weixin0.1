package com.cheng.weixin.web.security;

import com.cheng.weixin.core.entity.User;
import com.cheng.weixin.core.service.IUserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Author: Cheng
 * Date: 2016/1/26 0026
 */
public class SystemAuthorizingRealm extends AuthorizingRealm {
    @Autowired
    private IUserService userService;

    // 返回一个唯一的Realm名字
    @Override
    public String getName() {
        return super.getName();
    }
    // 判断此Realm是否支持此Token
    @Override
    public boolean supports(AuthenticationToken token) {
        // 仅支持UsernamePasswordToken类型的Token
        return token instanceof WxUsernamePasswordToken ;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        WxUsernamePasswordToken token = (WxUsernamePasswordToken) authenticationToken;

        User user = userService.getUserByUsername(token.getUsername());

        System.out.println("=======AuthenticationInfo=======");
        return null;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        System.out.println("=======AuthorizationInfo=======");

        return null;
    }
}

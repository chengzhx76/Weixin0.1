package com.cheng.weixin.web.utils;

import com.cheng.weixin.web.security.SystemAuthorizingRealm.Principal;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

/**
 * Desc: 用户工具
 * Author: Cheng
 * Date: 2016/2/1 0001
 */
public class UserUtils {
    /**
     * 获取当前登陆者对象
     * @return
     */
    public static Principal getPrincipal() {
        Subject subject = SecurityUtils.getSubject();
        Principal principal = (Principal) subject.getPrincipal();
        if (principal!=null) {
            return principal;
        }
        return null;
    }
}

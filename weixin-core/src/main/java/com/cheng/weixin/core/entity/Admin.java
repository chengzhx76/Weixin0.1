package com.cheng.weixin.core.entity;

/**
 * 用户实体
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
public class Admin extends DataEntity<Admin> {
    /** 用户名 **/
    private String username;
    /** 密码（盐值和密匙） **/
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

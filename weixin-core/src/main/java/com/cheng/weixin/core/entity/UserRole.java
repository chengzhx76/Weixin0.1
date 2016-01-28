package com.cheng.weixin.core.entity;

/**
 * Desc: 用户与角色对应关系
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
public class UserRole extends BaseEntity<UserRole> {
    /** 用户ID **/
    private int userId;
    /** 角色ID **/
    private int roleId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}

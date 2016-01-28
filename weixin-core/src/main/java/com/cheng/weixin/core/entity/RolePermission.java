package com.cheng.weixin.core.entity;

/**
 * Desc: 角色和权限对应关系
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
public class RolePermission extends BaseEntity<RolePermission> {
    /** 角色ID **/
    private int roleId;
    /** 权限ID **/
    private int permissionId;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }
}

package com.cheng.weixin.core.entity;

/**
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
public class Role extends DataEntity<Role> {
    /** 角色名字 **/
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

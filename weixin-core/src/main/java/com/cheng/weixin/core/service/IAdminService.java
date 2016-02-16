package com.cheng.weixin.core.service;


import com.cheng.weixin.core.entity.Admin;

import java.util.List;

/**
 * Desc: 用户业务处理
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
public interface IAdminService {
    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    Admin getUserByUsername(String username);

    /**
     * 获取所有的用户
     * @return
     */
    List<Admin> findAll();
}

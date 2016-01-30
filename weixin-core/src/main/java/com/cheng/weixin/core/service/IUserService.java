package com.cheng.weixin.core.service;


import com.cheng.weixin.core.entity.User;

import java.util.List;

/**
 * Desc: 用户业务处理
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
public interface IUserService {
    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    User getUserByUsername(String username);

    /**
     * 获取所有的用户
     * @return
     */
    List<User> findAll();
}

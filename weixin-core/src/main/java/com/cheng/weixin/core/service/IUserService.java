package com.cheng.weixin.core.service;

import com.cheng.weixin.core.entity.User;

import java.util.List;

/**
 * Desc:
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
public interface IUserService {
    /**
     * 获取全部用户
     * @return
     */
    List<User> getAll();

}

package com.cheng.weixin.core.service;


import com.cheng.weixin.core.dao.UserDaoMapper;
import com.cheng.weixin.core.entity.User;

/** 用户业务处理
 * Desc:
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
public interface IUserService extends ICrudService<UserDaoMapper, User> {
    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    User getUserByUsername(String username);
}

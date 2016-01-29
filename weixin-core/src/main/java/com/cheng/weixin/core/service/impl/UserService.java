package com.cheng.weixin.core.service.impl;

import com.cheng.weixin.core.dao.UserDaoMapper;
import com.cheng.weixin.core.entity.User;
import com.cheng.weixin.core.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * Desc: 用户业务类
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
@Service
public class UserService extends CrudService<UserDaoMapper, User> implements IUserService {

    @Override
    public User getUserByUsername(String username) {
        return dao.loadUserByUsername(username);
    }
}

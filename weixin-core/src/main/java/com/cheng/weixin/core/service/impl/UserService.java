package com.cheng.weixin.core.service.impl;

import com.cheng.weixin.core.entity.User;
import com.cheng.weixin.core.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desc: 用户业务类
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
@Service
public class UserService extends BaseWeixinService implements IUserService {
    @Override
    public List<User> getAll() {
        return userDao.loadAll();
    }
}

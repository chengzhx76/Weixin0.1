package com.cheng.weixin.core.service.impl;

import com.cheng.weixin.core.entity.Admin;
import com.cheng.weixin.core.service.IAdminService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desc: 用户业务类
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
@Service
public class AdminService extends BaseService implements IAdminService {

    @Override
    public Admin getUserByUsername(String username) {
        return adminDao.loadUserByUsername(username);
    }

    @Override
    public List<Admin> findAll() {
        return adminDao.loadAll();
    }

    //@Override
    //public BaseDaoMapper<User> getBaseDao() {
    //    return userDao;
    //}

}

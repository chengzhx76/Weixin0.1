package com.cheng.weixin.core.dao;

import com.cheng.weixin.core.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Desc: 用户mapper
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
@Repository
public interface UserDaoMapper extends BaseDaoMapper<User> {
    /**
     * 根据用户名获取用户信息
     * @param username
     * @return
     */
    User loadUserByUsername(String username);

}

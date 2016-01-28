package com.cheng.weixin.core.service.impl;

import com.cheng.weixin.core.common.WeixinUrl;
import com.cheng.weixin.core.dao.UserDaoMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Desc: 业务处理基类
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
public abstract class BaseWeixinService {

    @Autowired
    protected WeixinUrl weixinUrl;
    @Autowired
    protected UserDaoMapper userDao;
}

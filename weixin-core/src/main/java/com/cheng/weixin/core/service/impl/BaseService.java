package com.cheng.weixin.core.service.impl;

import com.cheng.weixin.core.common.WeixinUrl;
import com.cheng.weixin.core.dao.WxGroupDaoMapper;
import com.cheng.weixin.core.dao.WxMenuDaoMapper;
import com.cheng.weixin.core.dao.AdminDaoMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Desc: 业务处理基类
 * Author: Cheng
 * Date: 2016/1/29 0029
 */
public abstract class BaseService {
    @Autowired
    protected WeixinUrl weixinUrl;
    @Autowired
    protected WxGroupDaoMapper wxgroupDao;
    @Autowired
    public WxMenuDaoMapper wxmenuDao;
    @Autowired
    public AdminDaoMapper adminDao;
}

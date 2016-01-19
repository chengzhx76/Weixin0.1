package com.cheng.weixin.core.service.impl;

import com.cheng.weixin.core.common.WeixinUrl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 光灿 on 2016/1/18.
 */
public abstract class BaseWeixinService {

    @Autowired
    protected WeixinUrl weixinUrl;
}

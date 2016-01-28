package com.cheng.weixin.web.controllers;

import com.cheng.weixin.core.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Cheng on 2016/1/20 0020.
 */
public abstract class BaseController {
    /** 统一的日志对象 **/
    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    protected IUserService userService;

}

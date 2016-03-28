package com.cheng.weixin.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Desc: 用户
 * Author: Cheng
 * Date: 2016/3/28 0028
 */
@Controller
public class UserController extends BaseController  {
    @RequestMapping(value = "myinfo",method = RequestMethod.GET)
    public String selfInfo() {
        return "user/myInfo";
    }
}

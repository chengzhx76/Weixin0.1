package com.cheng.weixin.web.controllers;

import com.cheng.weixin.core.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Author: 光灿
 * Date: 2016/1/24
 */
@Controller
public class IndexController extends BaseController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        List<User> users = userService.getAll();
        for (User user : users) {
            System.out.println(user);
        }
        return "index";
    }

}

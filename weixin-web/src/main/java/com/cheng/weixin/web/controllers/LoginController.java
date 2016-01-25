package com.cheng.weixin.web.controllers;

import com.cheng.weixin.web.utils.Captcha;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Author: 光灿
 * Date: 2016/1/24
 */
@Controller
public class LoginController extends BaseController {

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "drawCheckCode",method = RequestMethod.GET)
    public void drawCheckCode(HttpServletResponse resp, HttpSession session) throws IOException {
        resp.setContentType("image/jpg");
        resp.setHeader("Pragma", "No-cache");
        resp.setHeader("Cache-Control", "no-cache");
        resp.setDateHeader("Expires", 0);
        int width = 200;//设置验证码的宽度
        int height = 30;//验证码的高度
        Captcha c = Captcha.getInstance();
        c.set(width, height);
        String checkcode = c.generateCheckcode();
        session.setAttribute("checkcode",checkcode);
        OutputStream os = resp.getOutputStream();
        ImageIO.write(c.generateCheckImg(checkcode), "jpg", os);
    }
}

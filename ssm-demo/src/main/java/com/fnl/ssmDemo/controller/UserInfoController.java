package com.fnl.ssmDemo.controller;

import com.fnl.ssmDemo.service.IUserInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName UserInfoController
 * @Description TODO
 * @Author dengcheng
 * @Date 2018/10/10 0010 上午 10:28
 **/
@RestController
public class UserInfoController {
    @Resource
    IUserInfoService userInfoService;

    @RequestMapping("/hello")
    public Object index(){
        return "hello,world";
    }
}

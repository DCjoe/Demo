package com.fnl.ssmDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author dengcheng
 * @Date 2018/10/10 0010 下午 14:43
 **/
@Controller
public class IndexController {

    @RequestMapping("/")
    public String IndexPage(){
        return "index";
    }
}

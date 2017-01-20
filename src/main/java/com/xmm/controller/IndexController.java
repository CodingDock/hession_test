package com.xmm.controller;

import com.xmm.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 肖明明 on 2017/1/20.
 */
@Controller
@RequestMapping("/*")
public class IndexController {

    @ResponseBody
    @RequestMapping(value = "hello")
    public String hello(){
        return "Hello!  I am alive!";
        
    }

    @ResponseBody
    @RequestMapping(value = "user")
    public User getUser(){
        return new User(2,"张三");

    }
    
}

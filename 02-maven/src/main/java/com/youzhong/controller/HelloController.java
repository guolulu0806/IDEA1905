package com.youzhong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/test")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello page");
        return "hello";
    }

}

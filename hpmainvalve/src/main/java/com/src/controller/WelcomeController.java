package com.src.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//首页
@RestController
public class WelcomeController {


    @RequestMapping("/welcome")
    public String welcome(){
        System.out.println("这是一个欢迎界面");

        return "返回：这是一个欢迎界面";
    }
}

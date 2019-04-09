package com.src.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//注销
@RestController
public class logoutController {


    @RequestMapping("/logout")
    public String logout(){
        System.out.println("注销");
        return "返回：注销";
    }
}

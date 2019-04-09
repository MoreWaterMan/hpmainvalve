package com.src.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//权限管理
@RestController
public class rightManageController {

    @RequestMapping("/rightManage")
    public String rightManage(){
        System.out.println("权限管理");
        return "返回：权限管理";
    }
}

package com.src.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//实测数据
@RestController
@RequestMapping("/actualData")
public class actualDataController {


    @RequestMapping("/actualData")
    public String actualData(){
        System.out.println("实时监测里的数据通讯");
        return "返回：实时监测里的数据通讯";
    }

}

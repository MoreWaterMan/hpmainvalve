package com.src.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//历史数据
@RestController
public class historyDataController {


    @RequestMapping("/historyData")
    public String historyData(){
        System.out.println("历史数据");
        return "返回：历史数据";
    }
}

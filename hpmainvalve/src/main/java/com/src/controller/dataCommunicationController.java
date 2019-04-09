package com.src.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//实测数据
@RestController
@RequestMapping("/dataCommunication")
public class dataCommunicationController {


    @RequestMapping("/start")
    public String dataCommunication(){
        System.out.println("实测数据");
        return "返回：实测数据";
    }
}

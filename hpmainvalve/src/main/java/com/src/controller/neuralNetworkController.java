package com.src.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//卷积神经网络诊断
@RestController
public class neuralNetworkController {


    @RequestMapping("/neuralNetwork")
    public String neuralNetwork(){
        System.out.println("卷积神经网络诊断");
        return "返回：卷积神经网络诊断";
    }
}

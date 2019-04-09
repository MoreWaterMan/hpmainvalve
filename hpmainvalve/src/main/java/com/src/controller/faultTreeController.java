package com.src.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//故障树诊断
@RestController
public class faultTreeController {


    @RequestMapping("/faultTree")
    public String faultTree(){
        System.out.println("故障树诊断");
        return "返回：故障树诊断";
    }
}

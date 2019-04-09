package com.src.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//实时监测里的实时数据
@RestController
public class DataSampleController {


    @RequestMapping("/DataSample")
    public String DataSample(){
        System.out.println("实时检测里的实时数据");
        return "返回：实时检测里的实时数据";
    }
}

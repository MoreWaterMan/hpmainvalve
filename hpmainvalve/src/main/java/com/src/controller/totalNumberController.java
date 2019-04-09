package com.src.controller;

//统计量
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class totalNumberController {


    @RequestMapping("/totalNumber")
    public String totalNumber(){
        System.out.println("统计量");
        return "返回：统计量";
    }

}

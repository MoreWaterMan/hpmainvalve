package com.src.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//状态评估
@RestController
public class stateEvaluationController {

    @RequestMapping("/stateEvaluation")
    public String stateEvaluation(){
        System.out.println("状态评估");
        return "返回：状态评估";
    }

}

package com.src.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//结构仿真
@RestController
public class structuralSimulationController {

    @RequestMapping("/structuralSimulation")
    public String structuralSimulation(){
        System.out.println("结构仿真");
        return "返回：结构仿真";
    }

}

package com.src.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//数值仿真
@RestController
public class digitalSimulationController {

    @RequestMapping("/digitalSimulation")
    public String digitalSimulation(){
        System.out.println("数值仿真");
        return "返回：数值仿真";
    }

}

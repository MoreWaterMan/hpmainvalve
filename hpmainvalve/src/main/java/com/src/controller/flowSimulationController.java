package com.src.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//流场仿真
@RestController
@RequestMapping("/flowSimulation")
public class flowSimulationController {


    @RequestMapping("/flowSimulation")
    public String flowSimulation(){
        System.out.println("流场仿真");
        return "返回：流场仿真";
    }

}

package com.src.controller;

import com.src.collection.DataCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Asus on 2019/1/3.
 */

@RestController
public class testController {

    @Autowired
    private DataCollection dataCollection;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @GetMapping("/collection")
    public String list(){
        Timer executeSchedule=new Timer();
        executeSchedule.schedule(new TimerTask() {
            @Override
            public void run() {
                redisTemplate.opsForValue().set(String.valueOf((System.currentTimeMillis()/100)*100),
                        String.valueOf((int)(Math.random()*100)));
                System.out.println(redisTemplate.opsForValue().get(String.valueOf((System.currentTimeMillis()/100)*100)));
            }
        },0,10000);
        redisTemplate.getHashValueSerializer();
//        System.out.println(redisTemplate.opsForValue().get(String.valueOf((System.currentTimeMillis()/100)*100)));
        return "index.html";
    }

    public static void main(String[] args) {

        Timer executeSchedule=new Timer();
        executeSchedule.schedule(new TimerTask() {
            @Override
                public void run() {
                System.out.println((System.currentTimeMillis()/100)*100);
            }
        },0,10000);

    }



}

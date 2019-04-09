package com.src.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Asus on 2019/1/18.
 */
@RestController("/redis")
public class RedisPublishController {

    private int m = 0;

    @Autowired
    private StringRedisTemplate template;

    @RequestMapping("/publish")
    private String publish(){
        int index = m;
        for(int i=m;i<index+10;i++){
            template.convertAndSend("mytopic", "这是我发第"+i+"条的消息啊");
        }
        return "结束";
    }
}

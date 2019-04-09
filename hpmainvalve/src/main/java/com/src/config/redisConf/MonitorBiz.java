
package com.src.config.redisConf;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.concurrent.TimeUnit;


/**
 * Redis数据统计业务类
 * 在监测系统中客户端请求往往很少，该业务场景中redis订阅功能不需要做很深的拓展
 * 这里使用Redis消息发布功能，将实时数据推送至WebSocket
 * Created by Asus on 2019/1/18.
 */

public class MonitorBiz {


    @Autowired
    StringRedisTemplate redisTemplate;


    /**
     * 1.将当日实时数据进行累加操作
     *
     * @param message
     */

    public void periodData(String message) {
        // 每日实时数据的hash结构增量统计
        increaseBy();
    }


    /**
     * 每日实时数据的hash结构管理
     */

    private void increaseBy() {
        //step:1 统计通道一数据
        redisTemplate.opsForValue().set("test", "100", 60 * 10, TimeUnit.SECONDS);
    }

}


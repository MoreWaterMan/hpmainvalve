package com.src.tool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * Created by Asus on 2019/1/18.
 */
public class RedisDao {

    @Autowired
    private StringRedisTemplate redisTemplate;



    public void setRedisTemplate(String key,String value){
        ValueOperations<String,String> ops= redisTemplate.opsForValue();
        ops.set(key,value);
    }

    public String getValue(String key){
        ValueOperations<String,String> ops=redisTemplate.opsForValue();
        return ops.get(key);
    }
}

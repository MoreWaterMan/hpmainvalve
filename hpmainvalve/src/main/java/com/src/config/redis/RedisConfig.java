package com.src.config.redis;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.io.Serializable;

/**
 *
 * redis配置
 * Created by Asus on 2019/1/19.
 */
@Configuration
@AutoConfigureAfter(RedisAutoConfiguration.class)
@EnableCaching
public class RedisConfig {

    /**
     * 默认情况下的模板只能支持RedisTemplate<String, String>，也就是只能存入字符串，因此支持序列化
     */
    @Bean
    public RedisTemplate<String, Serializable> redisCacheTemplate(LettuceConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Serializable> template = new RedisTemplate<>();
        template.setKeySerializer(new StringRedisSerializer());  //key采用String的序列化方式
        template.setHashKeySerializer(new StringRedisSerializer());//hash的key采用String的序列化方式
        template.setValueSerializer(new GenericJackson2JsonRedisSerializer());//value序列化方式采用jackson
        template.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());//hash的value序列化方式采用jackson
        template.setConnectionFactory(redisConnectionFactory);
        return template;
    }

}


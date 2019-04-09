/*

package com.src.config.redisConf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;


*/
/**
 * 配置消息监听容器
 * 容器需要连接工厂以及消息监听器，消息监听器中配置消息对象处理以及处理方法
 * Created by Asus on 2019/1/18.
 *//*


@Configuration
public class MyRedisConf {

    @Bean
    public RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory,
                                                   MessageListenerAdapter listenerAdapter) {
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.addMessageListener(listenerAdapter, new PatternTopic("mytopic"));
        return container;
    }

    @Bean
    public MessageListenerAdapter listenerAdapter() {
        return new MessageListenerAdapter(new Receiver(), "receiveMessage");
    }

    @Slf4j
    public class Receiver {
        public void receiveMessage(String message) {
            log.info("Received <" + message + ">");
        }
    }
}


*/

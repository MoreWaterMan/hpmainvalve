package com.src.config.websocket;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Dict;
import cn.hutool.json.JSONUtil;
import com.src.config.websocket.common.WebSocketConsts;
import com.src.config.websocket.model.ServerCpu;
import com.src.config.websocket.payloadVo.ServerSocketVo;
import com.src.config.websocket.util.ServerUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 服务器定时推送任务
 * Created by Asus on 2019/1/19.
 */
@Slf4j
@Component
@EnableScheduling
public class ServerSocketTask {

    @Autowired
    private SimpMessagingTemplate  messagingTemplate;

    /**
     * 按照标准时间，每个2秒执行一次
     */
    @Scheduled(cron = "0/2 * * * * ?")
    public void webSocketTask() throws Exception {
//        log.info("【推送消息】开始执行：{}", DateUtil.formatDateTime(new Date()));
        //查询redis缓存数据
        /****
         *
         *
         * 待完成。。。。。
         *
         * 监听redis数据变化统计获取重要信息，定时获取redis中数据，查看数据更新并推送至客户端
         *
         */
        ServerCpu serverCpu = new ServerCpu();
        serverCpu.copyTo();

        ServerSocketVo socketVo = ServerUtil.warpServerVo(serverCpu);

        Dict dict=ServerUtil.wrapServerDict(socketVo);

        messagingTemplate.convertAndSend(WebSocketConsts.PUSH_SERVER, JSONUtil.toJsonStr(dict));
//        log.info("【推送消息】执行结束：{}", DateUtil.formatDateTime(new Date()));

    }

}


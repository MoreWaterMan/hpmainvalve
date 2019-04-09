package com.src.controller;

import cn.hutool.core.lang.Dict;
import com.src.config.websocket.model.ServerCpu;
import com.src.config.websocket.payloadVo.ServerSocketVo;
import com.src.config.websocket.util.ServerUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 在线监测实时数据推送服务
 * Created by Asus on 2019/1/19.
 */

@RestController
@RequestMapping("/server")
public class ServerController {

    @GetMapping
    public Dict serverInfo() throws Exception{
        ServerCpu serverCpu = new ServerCpu();
        serverCpu.copyTo();
        ServerSocketVo serverSocketVo = ServerUtil.warpServerVo(serverCpu);
        Dict dict=ServerUtil.wrapServerDict(serverSocketVo);
        return dict;
    }


}

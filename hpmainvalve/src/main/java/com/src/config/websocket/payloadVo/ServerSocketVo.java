package com.src.config.websocket.payloadVo;

import com.google.common.collect.Lists;
import com.src.config.websocket.model.ServerCpu;
import com.src.config.websocket.payloadVo.server.CpuVo;
import lombok.Data;

import java.util.List;

/**
 * 服务器cpu信息
 * Created by Asus on 2019/1/19.
 */
@Data
public class ServerSocketVo {

    List<CpuVo> cpu= Lists.newArrayList();

    public ServerSocketVo create(ServerCpu serverCpu){
        cpu.add(CpuVo.create(serverCpu.getCpu()));
        return null;
    }

}

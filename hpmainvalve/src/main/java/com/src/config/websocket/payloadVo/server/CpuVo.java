package com.src.config.websocket.payloadVo.server;

import com.google.common.collect.Lists;
import com.src.config.websocket.model.server.Cpu;
import lombok.Data;

import java.util.List;

/**
 *
 * cpu相关信息实体Vo
 * Created by Asus on 2019/1/19.
 */
@Data
public class CpuVo {
    List<KV> data = Lists.newArrayList();

    public static CpuVo create(Cpu cpu) {
        CpuVo vo = new CpuVo();
        vo.data.add(new KV("核心数", cpu.getCpuNum()));
        vo.data.add(new KV("CPU总的使用率", cpu.getTotal()));
        vo.data.add(new KV("CPU系统使用率", cpu.getSys() + "%"));
        vo.data.add(new KV("CPU用户使用率", cpu.getUsed() + "%"));
        vo.data.add(new KV("CPU当前等待率", cpu.getWait() + "%"));
        vo.data.add(new KV("CPU当前空闲率", cpu.getFree() + "%"));
        return vo;
    }
}

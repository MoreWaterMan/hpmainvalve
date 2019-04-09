package com.src.config.websocket.util;

import cn.hutool.core.lang.Dict;
import com.src.config.websocket.model.ServerCpu;
import com.src.config.websocket.payloadVo.ServerSocketVo;

/**
 * Created by Asus on 2019/1/19.
 */
public class ServerUtil {

    /**
     * 包装成 ServerSocketVo
     * @param serverCpu
     * @return
     */
    public static ServerSocketVo warpServerVo(ServerCpu serverCpu){
        ServerSocketVo serverSocketVo=new ServerSocketVo();
        serverSocketVo.create(serverCpu);
        return serverSocketVo;
    }


    /**
     * 包装成 Dict
     * @param serverSocketVo
     * @return
     */
    public static Dict wrapServerDict(ServerSocketVo serverSocketVo){
        Dict dict = Dict.create()
                .set("cpu",serverSocketVo.getCpu().get(0).getData());
        return dict;
    }

}

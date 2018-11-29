package com.kqa.websocket.business.dataprocess;


/**
 * 执行命令服务
 */
public interface ICmdService {
    String process(String message);
    CmdType getCmdType();
}

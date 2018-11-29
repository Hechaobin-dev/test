package com.kqa.websocket.message.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class CmdAnswerItem27 implements Serializable {


    /**
     * 单位
     */
    private String unitGuid;


    /**
     * 房间
     */
    private String roomGuid;


    /**
     * 指令GUID
     */
    private String cmdGuid;


    /**
     * 状态 0
     */
    private int state;


    /**
     * 执行结果消息
     */
    private String msg;

}

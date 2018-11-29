package com.kqa.websocket.message.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class CmdAnswerItem11 implements Serializable {

    /**
     * 挂失guid
     */
    private String lossGuid;

    /**
     * 状态 0
     */
    private int state;


    /**
     * 执行结果消息
     */
    private String msg;

}

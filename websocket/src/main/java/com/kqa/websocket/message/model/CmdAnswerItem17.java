package com.kqa.websocket.message.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class CmdAnswerItem17 implements Serializable {

    /**
     * 门锁主键
     */
    private String waterID;

    /**
     * 状态 0
     */
    private int state;


    /**
     * 执行结果消息
     */
    private String msg;

}

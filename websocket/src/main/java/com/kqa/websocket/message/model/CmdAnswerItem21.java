package com.kqa.websocket.message.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class CmdAnswerItem21 implements Serializable {


    /**
     * 指令ID
     */
    private String cmdListID;


    /**
     * 状态 0
     */
    private int state;


    /**
     * 执行结果消息
     */
    private String msg;

}

package com.kqa.websocket.message.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class CmdAnswerItem09 implements Serializable {


    /**
     * 用户guid
     */
    private String userGuid;


    /**
     * 状态 0
     */
    private int state;


    /**
     * 执行结果消息
     */
    private String msg;




}

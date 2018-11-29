package com.kqa.websocket.message.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CmdAnswerItem19 implements Serializable {


    /**
     * 门禁主键
     */
    private String entranceID;


    /**
     * 状态 0
     */
    private int state;


    /**
     * 执行结果消息
     */
    private String msg;



}

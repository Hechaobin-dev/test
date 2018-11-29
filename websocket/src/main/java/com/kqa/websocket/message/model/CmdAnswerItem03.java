package com.kqa.websocket.message.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class CmdAnswerItem03 implements Serializable {

    /**
     * 区域索引
     */
    private String areaGuid;


    /**
     * 状态 0
     */
    private int state;


    /**
     * 执行结果消息
     */
    private String msg;

}

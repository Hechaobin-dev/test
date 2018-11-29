package com.kqa.websocket.message.model;


import lombok.Data;

import java.io.Serializable;


/**
 * 命令 5 命令7
 */
@Data
public class CmdAnswerItem05 implements Serializable {

    /**
     * 楼栋guid
     */
    private String buildingGuid;


    /**
     * 状态 0
     */
    private int state;


    /**
     * 执行结果消息
     */
    private String msg;


}

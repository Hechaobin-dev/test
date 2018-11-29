package com.kqa.websocket.message.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class CmdAnswerItem07 implements Serializable {

    /**
     * 楼栋guid
     */
    private String buildingGuid;


    /**
     * 房间guid
     */
    private String roomGuid;


    /**
     * 状态 0
     */
    private int state;


    /**
     * 执行结果消息
     */
    private String msg;

}

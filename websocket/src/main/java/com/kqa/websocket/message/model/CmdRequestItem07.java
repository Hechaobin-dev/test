package com.kqa.websocket.message.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class CmdRequestItem07 implements Serializable {



    private String buildingGuid;

    private String roomGuid;

    private String roomName;

    private String roomCode;

    private String roomType;

    private String superiorRoomGuid;

    private String layers;

    private String limit;

    private String roomPhoneNumber;

    private String principal;

    private String doorLockCode;

    private String doorLockModel;

    private String waterControlCode;

    private String waterControlModel;

    private String electricMeterCode;

    private String channel;

    private String entranceGuardCode;

    private String entranceGuardModel;
    /**
     * 门禁机状态
     */
    private Integer entranceGuardState;

    /**
     * 门禁机状态更新时间
     */
    private LocalDateTime entranceGuardUpdateTime;

    /**
     * 1新增 2修改 3删除
     */
    private String syncType;

}

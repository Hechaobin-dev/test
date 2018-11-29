package com.kqa.websocket.message.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CmdRequestItem25 implements Serializable {

    private String namelistGuid;

    private String roomGuid;

    private String terminalCode;

    private String terminalType;

    private String userGuid;

    private String unitGuid;

    private String cardNumber;

    private String logicalCardNumber;

    private String sunday;

    private String monday;

    private String tuesday;

    private String wednesday;

    private String thursday;

    private String friday;

    private String saturday;

    private String backLock;

    private String updateFlag;

    /**
     * 修改类型 挂失修改 平台修改
     */
    private String updateType;

    private String normalTimeStageIndex;

    private String holidayTimeStageIndex;

    private String weekTimeStageIndex;

    private String lastUpdate;

    private String startTime;

    private String endTime;

    /**
     * 下载状态 0未下载 1待下载 2下载成功 3下载失败 4设备名单已满,5 名单内容有误 6 找不到对应的设备 7名单已过期
     */
    private String downloadState;

    private String syncState;

}

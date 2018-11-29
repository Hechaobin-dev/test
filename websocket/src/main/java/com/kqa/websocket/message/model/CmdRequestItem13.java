package com.kqa.websocket.message.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CmdRequestItem13 implements Serializable {

    private String nameListGuid;

    private String terminalCode;

    private String roomGuid;

    private String userGuid;

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

    private String normalTimeStageIndex;

    private String holidayTimeStageIndex;

    private String weekTimeStageIndex;

    private String lastUpdate;

    private String startTime;

    private String endTime;

    /**
     * 1新增 2修改 3删除
     */
    private String syncType;

}

package com.kqa.websocket.message.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CmdRequestItem11 implements Serializable {

    private String lossGuid;

    private String userGuid;

    private String cardNumber;

    private String logicalCardNumber;

    private String operator;

    private String cardTime;

    private String validTime;

    private String operationType;

    private String operationTime;

    /**
     * 1新增 2修改 3删除
     */
    private String syncType;
}

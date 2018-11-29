package com.kqa.websocket.message.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CmdRequestItem17 implements Serializable {

    private String waterID;

    private String roomGuid;

    private String userGuid;

    private String userName;

    private String cardNumber;

    private String logicalCardNumber;

    private String dateMakeTime;

    private String mainBalance;

    private String expenditure;

    private String newBalance;

    private String isSuccess;

    private String useType;

    private String waterAmount;

    private String surplusAmount;

    private String pulseFlag;

}

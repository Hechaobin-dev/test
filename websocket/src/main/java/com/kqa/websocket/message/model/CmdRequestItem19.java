package com.kqa.websocket.message.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CmdRequestItem19 implements Serializable {

    private String entranceID;

    private String roomGuid;

    private String userGuid;

    private String userName;

    private String cardNumber;

    private String logicalCardNumber;

    private String dateMakeTime;

    private String readerNumber;

    private String useType;
}

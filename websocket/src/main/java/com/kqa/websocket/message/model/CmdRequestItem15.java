package com.kqa.websocket.message.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class CmdRequestItem15 implements Serializable {

    private String lockID;

    private String roomGuid;

    private String userGuid;

    private String userName;

    private String cardNumber;

    private String logicalCardNumber;

    private String dateMakeTime;

    private String dataType;


}

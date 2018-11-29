package com.kqa.websocket.message.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class CmdRequestItem23 implements Serializable {

    private String exceptionID;

    private String controllerGuid;

    private String roomGuid;

    private String terminalGuid;

    private String terminalCode;

    private String terminalType;

    private String exceptionType;

    private String exceptionTime;


}

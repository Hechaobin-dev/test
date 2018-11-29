package com.kqa.websocket.message.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class CmdRequestItem21 implements Serializable {

    private String cmdListID;

    private String roomGuid;

    private String terminalCode;

    private String cmdNumber;

    private String cmdContent;

    private String operator;

    private String cmdMakeTime;

}


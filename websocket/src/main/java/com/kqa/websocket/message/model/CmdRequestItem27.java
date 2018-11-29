package com.kqa.websocket.message.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class CmdRequestItem27 implements Serializable {

    private String unitGuid;

    private String stationGuid;

    private String roomGuid;

    private String cmdGuid;

    private String cmdNumber;

    private String cmdContent;

    private String operator;

    private String cmdMakeTime;

    private String cmdExecutionState;


}

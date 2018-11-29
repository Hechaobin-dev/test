package com.kqa.websocket.business.dataprocess;


import org.springframework.stereotype.Component;

@Component
public class CmdRequest01 implements ICmdService  {

    @Override
    public String process(String message) {
        return message;
    }


    @Override
    public CmdType getCmdType() {
        return CmdType.CMD_REQUEST_01;
    }
}

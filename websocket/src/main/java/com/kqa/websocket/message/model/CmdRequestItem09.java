package com.kqa.websocket.message.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CmdRequestItem09 implements Serializable {

    private String userGuid;

    private String roomGuid;

    private String doorLookCode;

    private String waterControlCode;

    private String electricMeterCode;

    private String controllerGuid;

    private String userCode;

    private String cardNumber;

    private String logicalCardNumber;

    private String name;

    private String sex;

    private String birthday;

    private String idCard;

    private String postCode;

    private String contact;

    private String contactPhone;

    private String email;

    private String homeAddress;

    private String regTime;
    private String state;

    private String userType;

    private String userName;

    private String userPassword;

    /**
     * 1新增 2修改 3删除
     */
    private String syncType;

}

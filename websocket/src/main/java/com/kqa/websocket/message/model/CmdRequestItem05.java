package com.kqa.websocket.message.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class CmdRequestItem05 implements Serializable {


    /**
     * 楼栋GUID
     */
    private String buildingGuid;

    /**
     * 楼栋名称
     */
    private String buildingName;

    /**
     * 楼栋编码
     */
    private String buildingCode;


    /**
     * 楼层
     */
    private int floors;


    /**
     * 负责人
     */
    private String principal;


    /**
     * 1新增 2修改 3删除
     */
    private String syncType;
}

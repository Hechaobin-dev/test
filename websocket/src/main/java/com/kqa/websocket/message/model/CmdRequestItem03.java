package com.kqa.websocket.message.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CmdRequestItem03 implements Serializable {

    /**
     *
     */
    private String areaGuid;

    private String superiorAreaGuid;


    /**
     * 区域Id
     */
    private String areaName;


    /**
     * 负责人
     */
    private String principal;

    /**
     * 是否启用
     */
    private String isUse;

    /**
     * 是否删除
     */
    private String isDelete;

    /**
     *
     */
    private String remark;

    /**
     * 1新增 2修改 3删除
     */
    private String syncType;


}

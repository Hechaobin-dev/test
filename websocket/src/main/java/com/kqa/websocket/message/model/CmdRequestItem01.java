package com.kqa.websocket.message.model;



import lombok.Data;

import java.io.Serializable;

@Data
public class CmdRequestItem01 implements Serializable {

    /**
     * 单位名称
     */
    private String unitName;

    /**
     * 单位编号
     */
    private String unitCode;

    /**
     *单位电话
     */
    private String phoneNumber;


    /**
     * 联系人
     */
    private String linkMan;

    /**
     * 传真
     */
    private String fax;

    /**
     * 网址
     */
    private String website;

    /**
     * 单位地址
     */
    private String address;

    /**
     * 删除数据的周期
     */
    private String deleteCycle;


    /**
     * 1新增 2修改 3删除
     */
    private String syncType;


}

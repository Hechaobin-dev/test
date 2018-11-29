package com.kqa.websocket.message;

import lombok.Data;

@Data
public class DataMessage<T> implements BaseData {


    /**
     * 单位guid
     */
    private String code;

    /**
     * 命令类型  1  3  5  7  9
     */
    private String cmd;

    /**
     * 请求方向  1 请求包   2 应答包
     */
    private String direction;

    /**
     * 命令流水号
     */
    private String serialNumber;

    /**
     * 中间件guid
     */
    private String middlewareGuId;


    private T data;
}

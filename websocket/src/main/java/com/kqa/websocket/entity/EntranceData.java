package com.kqa.websocket.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 门禁刷卡数据表
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_entrance_data")
public class EntranceData implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自动编号
     */
    @TableId(value = "pk_lock_id", type = IdType.AUTO)
    private Integer pkLockId;

    /**
     * 单位GUID
     */
    private String idxUnitGuid;

    /**
     * 房间GUID
     */
    private String idxRoomGuid;

    /**
     * 门禁编号
     */
    private String entranceCode;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户GUID
     */
    private String idxUserGuid;

    /**
     * IC卡物理号
     */
    private String cardNumber;

    /**
     * 逻辑卡号
     */
    private String logicalCardNumber;

    /**
     * 数据产生时间
     */
    private LocalDateTime dataMakendTime;

    /**
     * 读头编号
     */
    private Integer readerNumber;

    /**
     * 数据类型
     */
    private Integer dataType;

    /**
     * 这里获取的时间是数据到云平台的时间
     */
    private LocalDateTime dataGatherTime;


}

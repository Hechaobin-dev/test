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
 * 房间信息
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_room_info")
public class RoomInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "idt_room_info", type = IdType.AUTO)
    private Integer idtRoomInfo;

    /**
     * 房间GUID
     */
    private String idxRoomGuid;

    /**
     * 楼栋GUID
     */
    private String buildingGuid;

    /**
     * 单位GUID
     */
    private String idxUnitGuid;

    /**
     * 房间名称
     */
    private String roomName;

    /**
     * 房间编号(四位数)
     */
    private String roomCode;

    /**
     * 房间类型  0主房 1子房间
     */
    private Integer roomType;

    /**
     * 上级房间ID
     */
    private Integer speriorId;

    /**
     * 上级房间GUID
     */
    private String speriorGuid;

    /**
     * 楼层
     */
    private Integer layers;

    /**
     * 房内最大入住人数
     */
    private Integer limitNum;

    /**
     * 当前入住人数
     */
    private Integer currentNum;

    /**
     * 房间联系电话
     */
    private String roomPhoneNumber;

    /**
     * 负责人
     */
    private String principal;

    /**
     * 门锁编号
     */
    private String doorLockCode;

    /**
     * 门锁最后刷卡人的姓名
     */
    private String lastSwipeCardPeople;

    /**
     * 门锁最后刷卡时间
     */
    private LocalDateTime lastSwipeCardTime;

    /**
     * 门锁型号
     */
    private Integer doorLockModel;

    /**
     * 门锁状态
     */
    private Integer doorLockState;

    /**
     * 门锁状态更新时间
     */
    private LocalDateTime doorLockUpdateTime;

    /**
     * 水控编号
     */
    private String waterContorlCode;

    /**
     * 水控型号
     */
    private Integer waterContorlModel;

    /**
     * 水控状态
     */
    private Integer waterContorlState;

    /**
     * 水控状态更新时间
     */
    private LocalDateTime waterContorlUpdateTime;

    /**
     * 电表编号
     */
    private String electricMeterCode;

    /**
     * 电表状态
     */
    private Integer electricMeterState;

    /**
     * 电表状态更新时间
     */
    private LocalDateTime electricMeterUpdateTime;

    /**
     * 门禁编号
     */
    private String entranceGuardCode;

    /**
     * 门禁机型号
     */
    private Integer entranceGuardModel;

    /**
     * 门禁机状态
     */
    private Integer entranceGuardState;

    /**
     * 门禁机状态更新时间
     */
    private LocalDateTime entranceGuardUpdateTime;

    /**
     * 信道号
     */
    private Integer channelNum;

    /**
     * 同步状态
     */
    private Integer syncState;


}

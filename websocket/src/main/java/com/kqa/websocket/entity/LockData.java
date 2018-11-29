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
 * 门锁刷卡数据表
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_lock_data")
public class LockData implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自动编号
     */
    @TableId(value = "pk_lock_id", type = IdType.AUTO)
    private Integer pkLockId;

    /**
     * 门锁GUID
     */
    private String lockGuid;

    /**
     * 单位GUID
     */
    private String idxUnitGuid;

    /**
     * 房间GUID
     */
    private String idxRoomGuid;

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
     *  记录类型 1  正常刷卡      2  非法卡
            3  钥匙开门      4  远程开门
            5  远程常开      6  远程封门
            7  反锁          8  解除反锁
            10 假锁          11 卡格式错误  
            12 脱机授权记录  21 密码开门
            22 超级密码开门  23 胁迫密码开门
            25 电量数据      34 远程关门
            35 远程取消常开  36 远程取消封门     
            252 配置卡       253 授权卡
            
     */
    private Integer dataType;

    /**
     * 这里获取的时间是数据到云平台的时间
     */
    private LocalDateTime dataGatherTime;


}

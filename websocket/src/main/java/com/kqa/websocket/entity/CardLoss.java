package com.kqa.websocket.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 挂失信息表
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_card_loss")
public class CardLoss implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * IC卡物理号
     */
    private String cardNumber;

    /**
     * 挂失GUID
     */
    private String cardLossGuid;

    /**
     * 单位GUID
     */
    private String idxUnitGuid;

    /**
     * 用户GUID
     */
    private String idxUserGuid;

    /**
     * 逻辑卡号
     */
    private String logicalCardNumber;

    /**
     * 操作员ID
     */
    private Integer operator;

    /**
     * 发卡时间
     */
    private LocalDateTime cardTime;

    /**
     * 有效时间
     */
    private LocalDateTime validTime;

    /**
     * 挂失状态
     */
    private Integer lossState;

    /**
     * 挂失时间
     */
    private LocalDateTime lossTime;

    /**
     * 删除状态
     */
    private Integer deleteState;

    /**
     * 同步状态
     */
    private Integer syncState;


}

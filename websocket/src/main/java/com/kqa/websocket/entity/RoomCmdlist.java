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
 * 门锁指令表
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_room_cmdlist")
public class RoomCmdlist implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "pk_cmdlist_id", type = IdType.AUTO)
    private Integer pkCmdlistId;

    /**
     * 单位GUID
     */
    private String idxUnitGuid;

    /**
     * 站点GUID
     */
    private String idxStationGuid;

    /**
     * 房间GUID
     */
    private String idxRoomGuid;

    /**
     * 指令GUID
     */
    private String cmdGuid;

    /**
     * 指令编号（远程门锁操作为19）
     */
    private Integer cmdNumber;

    /**
     * 指令内容 远程开门 01 + 远程闭门 0200000000000000 远程常开0300000000000000
     */
    private String cmdContent;

    /**
     * 操作人员GUID
     */
    private String operator;

    /**
     * 指令生成时间
     */
    private LocalDateTime cmdMakeTime;

    /**
     * 指令执行状态
     */
    private Integer cmdExecutionState;

    /**
     * 同步状态 0未同步1已同步
     */
    private Integer syncState;

    /**
     * 指令同步时间
     */
    private LocalDateTime syncTime;


}

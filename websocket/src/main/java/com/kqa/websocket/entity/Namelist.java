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
 * 授权明细表
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_namelist")
public class Namelist implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "pk_namelist_id", type = IdType.AUTO)
    private Integer pkNamelistId;

    /**
     * 授权明细表GUID
     */
    private String idxNamelistGuid;

    /**
     * 房间GUID
     */
    private String idxRoomGuid;

    /**
     * 终端编号
     */
    private Integer terminalCode;

    /**
     * 终端类型
     */
    private Integer terminalType;

    /**
     * 用户GUID
     */
    private String idxUserGuid;

    /**
     * 单位GUID
     */
    private String idxUnitGuid;

    /**
     * IC卡物理号
     */
    private String cardNumber;

    /**
     * 逻辑卡号
     */
    private String logicalCardNumber;

    /**
     * 启用例外星期日
     */
    private Integer sunday;

    /**
     * 启用例外星期一
     */
    private Integer monday;

    /**
     * 启用例外星期二
     */
    private Integer tuesday;

    /**
     * 启用例外星期三
     */
    private Integer wednesday;

    /**
     * 启用例外星期四
     */
    private Integer thursday;

    /**
     * 启用例外星期五
     */
    private Integer friday;

    /**
     * 启用例外星期六
     */
    private Integer saturday;

    /**
     * 是否反锁开门
     */
    private Integer backLock;

    /**
     * 更新标志
     */
    private Integer updateFlag;

    /**
     * 修改类型 挂失修改 平台修改
     */
    private Integer updateType;

    /**
     * 正常时段序号 范围：1-16
     */
    private Integer normalTimeStageIndex;

    /**
     * 假日时段序号 范围：1-16
     */
    private Integer holidayTimeStageIndex;

    /**
     * 周末时段序号 范围：1-16
     */
    private Integer weekTimeStageIndex;

    /**
     * 记录最后更新日期
     */
    private LocalDateTime lastUpdate;

    /**
     * 名单有效开始日期
     */
    private LocalDateTime startTime;

    /**
     * 名单有效结束日期
     */
    private LocalDateTime endTime;

    /**
     *  下载状态 0未下载 1待下载 2下载成功 3下载失败 4设备名单已满,5 名单内容有误 6 找不到对应的设备 7名单已过期
     */
    private Integer downloadState;

    /**
     * 同步状态
     */
    private Integer syncState;


}

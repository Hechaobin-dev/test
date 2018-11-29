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
 * 设备异常状态
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_terminal_exception")
public class TerminalException implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "pk_exception_id", type = IdType.AUTO)
    private Integer pkExceptionId;

    /**
     * 单位GUID
     */
    private String idxUnitGuid;

    /**
     * 站点GUID
     */
    private String idxStationGuid;

    /**
     * 控制器GUID
     */
    private String idxControllerGuid;

    /**
     * 设备GUID
     */
    private String idxTerminalGuid;

    /**
     * 异常类型
     */
    private Integer exceptionType;

    /**
     * 异常时间
     */
    private LocalDateTime exceptionTime;


}

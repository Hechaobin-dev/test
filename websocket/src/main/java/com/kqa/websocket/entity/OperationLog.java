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
 * 终端用户操作日志
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_operation_log")
public class OperationLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "pk_log_id", type = IdType.AUTO)
    private Integer pkLogId;

    /**
     * 单位GUID
     */
    private String idxUnitGuid;

    /**
     * 用户GUID
     */
    private String idxUserGuid;

    /**
     * 操作类型
     */
    private Integer operationType;

    /**
     * 操作内容
     */
    private String operationContent;

    /**
     * 操作时间
     */
    private LocalDateTime operationDate;


}

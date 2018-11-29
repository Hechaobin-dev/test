package com.kqa.websocket.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 中间件信息
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_middleware_info")
public class MiddlewareInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "pk_middleware_id", type = IdType.AUTO)
    private Integer pkMiddlewareId;

    /**
     * 中间件GUID
     */
    private String middlewareGuid;

    /**
     * 中间件编号
     */
    private String middlewareNum;

    /**
     * 站点guid
     */
    private String stationGuid;

    /**
     * 同步状态
     */
    private Integer syncState;


}

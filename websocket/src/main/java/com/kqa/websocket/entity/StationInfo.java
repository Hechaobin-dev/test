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
 * 站点信息
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_station_info")
public class StationInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "pk_station_id", type = IdType.AUTO)
    private Integer pkStationId;

    /**
     * 站点guid
     */
    private String stationGuid;

    /**
     * 站点名称
     */
    private String stationName;

    /**
     * 单位GUID
     */
    private String unitGuid;

    /**
     * 同步状态
     */
    private Integer syncState;


}

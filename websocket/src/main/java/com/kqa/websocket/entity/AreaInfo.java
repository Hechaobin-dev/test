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
 * 区域信息表
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_area_info")
public class AreaInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "pk_area_id", type = IdType.AUTO)
    private Integer pkAreaId;

    /**
     * 索引
     */
    private String idxAreaGuid;

    /**
     * 上级区域GUID
     */
    private String idxSuperiorAreaGuid;

    /**
     * 单位GUID
     */
    private String idxUnitGuid;

    /**
     * 区域名称
     */
    private String areaName;

    /**
     * 负责人
     */
    private String principal;

    /**
     *  是否启用 1启用0禁用
     */
    private Integer isUse;

    /**
     * 0 未删 1删除
     */
    private Integer isDelete;

    /**
     * 备注
     */
    private String remark;

    /**
     * 同步状态
     */
    private Integer syncState;


}

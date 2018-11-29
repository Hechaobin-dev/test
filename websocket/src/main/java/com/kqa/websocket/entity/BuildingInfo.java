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
 * 楼栋资料
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_building_info")
public class BuildingInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "pk_building_id", type = IdType.AUTO)
    private Integer pkBuildingId;

    /**
     * 索引
     */
    private String idxBuildingGuid;

    /**
     * 单位GUID
     */
    private String idxUnitGuid;

    /**
     * 楼栋名称
     */
    private String buildingName;

    /**
     * 楼栋编号
     */
    private String buildingCode;

    /**
     * 楼层
     */
    private Integer floors;

    /**
     * 是否删除
     */
    private Integer isDelete;

    /**
     * 负责人
     */
    private String principal;

    /**
     * 同步状态
     */
    private Integer syncState;


}

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
 * 学校资料/单位资料
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_unit_info")
public class UnitInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "pk_unit_id", type = IdType.AUTO)
    private Integer pkUnitId;

    /**
     * 索引
     */
    private String idxUnitGuid;

    /**
     * 单位名称
     */
    private String unitName;

    /**
     * 单位编号
     */
    private String unitCode;

    /**
     * 单位电话
     */
    private String workPhoneNumber;

    /**
     * 联系人
     */
    private String linkMan;

    /**
     * 传真
     */
    private String fax;

    /**
     * 网址
     */
    private String website;

    /**
     * 单位地址
     */
    private String unitAddress;

    /**
     * 删除数据的周期
     */
    private Integer deleteCycle;


}

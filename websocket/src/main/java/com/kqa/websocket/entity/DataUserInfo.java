package com.kqa.websocket.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 人事资料
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_data_user_info")
public class DataUserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "pk_user_id", type = IdType.AUTO)
    private Integer pkUserId;

    /**
     * 用户GUID
     */
    private String idxUserGuid;

    /**
     * 单位GUID
     */
    private String idxUnitGuid;

    /**
     * 房间GUID
     */
    private String idxRoomGuid;

    /**
     * 门锁编号
     */
    private String doorLockCode;

    /**
     * 水控编号
     */
    private String waterControlCode;

    /**
     * 电表编号
     */
    private String electricMeterCode;

    /**
     * 控制器GUID
     */
    private String idxControllerGuid;

    /**
     * 用户编号
     */
    private String userNumber;

    /**
     * IC卡物理号
     */
    private String cardNumber;

    /**
     * 逻辑卡号
     */
    private String logicalCardNumber;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 性别
     */
    private Integer userSex;

    /**
     * 出生日期
     */
    private LocalDate brithday;

    /**
     * 身份证
     */
    private String idCard;

    /**
     * 邮编
     */
    private String postCode;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 联系电话
     */
    private String contactPhone;

    /**
     * E_Mail
     */
    private String email;

    /**
     * 地址
     */
    private String homeAddress;

    /**
     * 注册时间
     */
    private LocalDateTime regTime;

    /**
     * 删除状态
     */
    private Integer deleteState;

    /**
     * 用户类型 0操作员；1终端用户
     */
    private Integer userType;

    /**
     * 用户登录名称
     */
    private String loginName;

    /**
     * 用户登录密码
     */
    private String loginPassword;

    /**
     * 同步状态
     */
    private Integer syncState;


}

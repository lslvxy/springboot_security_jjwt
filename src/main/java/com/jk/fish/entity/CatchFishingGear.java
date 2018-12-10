package com.jk.fish.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;


/**
 * com.jk.fish.entity
 *
 * @author lise
 * @comment
 * @date 2018-12-10 10:22
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CatchFishingGear extends BaseEntity {


    /**
     * 唯一编号
     */
    private String catGuid;
    /**
     * 监测人员
     */
    private String monitPersion;
    /**
     * 测量编号
     */
    private String measureNo;
    /**
     * 类别
     */
    private String fishGearType;
    /**
     * 名称
     */
    private String fishGearName;
    /**
     * 参数一
     */
    private Double netLong;
    /**
     * 参数2
     */
    private Double netHigh;
    /**
     * 参数3
     */
    private Double mesh;
    /**
     * 照片
     */
    private String photo;
    /**
     * 数据入库单位
     */
    private String ownerUnit;
    /**
     * 数据管理用户
     */
    private Long ownerId;



}

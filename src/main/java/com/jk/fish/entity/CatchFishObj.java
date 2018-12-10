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
public class CatchFishObj extends BaseEntity {


    /**
     * 唯一编号
     */
    private String catGuid;
    /**
     * 监测人员
     */
    private String monitPersion;
    /**
     * 采样点名称
     */
    private String monitSiteName;
    /**
     * 所在江河
     */
    private String sectRive;
    /**
     * 采集日期
     */
    private java.util.Date monitDate;
    /**
     * 经度
     */
    private String eastLo;
    /**
     * 纬度
     */
    private String northLa;
    /**
     * 渔船
     */
    private String boat;
    /**
     * 开始时间
     */
    private java.util.Date beginTime;
    /**
     * 结束时间
     */
    private java.util.Date endTime;
    /**
     * 持续时间
     */
    private Double persistTime;
    /**
     * 作业频次
     */
    private String operationTime;
    /**
     * 作业频次
     */
    private String netTimes;
    /**
     * 中文鱼名
     */
    private String fishName;
    /**
     * 测量编号
     */
    private String measureNo;
    /**
     * 全长
     */
    private Double totalLeng;
    /**
     * 体长
     */
    private Double bodyLeng;
    /**
     * 体重
     */
    private Double bodyWeigh;
    /**
     * 是否做分子样
     */
    private String moleculeSample;
    /**
     * 尾数
     */
    private Double quantity;
    /**
     * 备注
     */
    private String remark;
    /**
     * 数据入库单位
     */
    private String ownerUnit;
    /**
     * 数据管理用户
     */
    private Long ownerId;



}

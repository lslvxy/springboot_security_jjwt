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
public class ContamiFish extends BaseEntity {


    /**
     * 唯一编号
     */
    private String conGuid;
    /**
     * 监测人员
     */
    private String monitPersion;
    /**
     * 测量编号
     */
    private String envMeasureNo;
    /**
     * 中文鱼名
     */
    private String fishName;
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
     * 性别
     */
    private String sex;
    /**
     * 年龄
     */
    private Double age;
    /**
     * 所在江河
     */
    private String sectRive;
    /**
     * 采样点名称
     */
    private String monitSiteName;
    /**
     * 经度
     */
    private String eastLo;
    /**
     * 纬度
     */
    private String northLa;
    /**
     * 采集日期
     */
    private java.util.Date monitDate;
    /**
     * 数据入库单位
     */
    private String ownerUnit;
    /**
     * 数据管理用户
     */
    private Long ownerId;



}

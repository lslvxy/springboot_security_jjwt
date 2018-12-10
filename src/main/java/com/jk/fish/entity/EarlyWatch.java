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
public class EarlyWatch extends BaseEntity {


    /**
     * 唯一编号
     */
    private String earGuid;
    /**
     * 监测人员
     */
    private String monitPersion;
    /**
     * 监测编号
     */
    private String monitNo;
    /**
     * 所在江河
     */
    private String sectRive;
    /**
     * 采样点名称
     */
    private String monitSiteName;
    /**
     * 断面名称
     */
    private String lineName;
    /**
     * 监测日期
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
     * 监测时间
     */
    private java.util.Date monitTime;
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
    private java.util.Date persistTime;
    /**
     * 网具
     */
    private String netModel;
    /**
     * 网口面积
     */
    private Double areaNetMou;
    /**
     * 网口倾角
     */
    private Double dipNetMou;
    /**
     * 网口流速
     */
    private Double veloNetMou;
    /**
     * 实际网口面积
     */
    private Double factAreaNetMou;
    /**
     * 距岸距离
     */
    private Double offDistan;
    /**
     * 采样水层
     */
    private String sampWlay;
    /**
     * 数据入库单位
     */
    private String ownerUnit;
    /**
     * 数据管理用户
     */
    private Long ownerId;



}

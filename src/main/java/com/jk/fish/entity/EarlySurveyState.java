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
public class EarlySurveyState extends BaseEntity {


    /**
     * 唯一编号
     */
    private String earGuid;
    /**
     * 监测人员
     */
    private String monitPersion;
    /**
     * 采样点名称
     */
    private String monitSiteName;
    /**
     * 断面名称
     */
    private String lineName;
    /**
     * 采集日期
     */
    private java.util.Date monitDate;
    /**
     * 断面采样点
     */
    private String locat;
    /**
     * 经度
     */
    private String eastLo;
    /**
     * 纬度
     */
    private String northLa;
    /**
     * 水层
     */
    private String sampWlay;
    /**
     * 水位涨落
     */
    private String levRisADown;
    /**
     * 位点水深
     */
    private Double waterLev;
    /**
     * 采集深度
     */
    private Double waterDep;
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
     * 鱼卵数
     */
    private Double numEgg;
    /**
     * 鱼苗数
     */
    private Double numPre;
    /**
     * 数据入库单位
     */
    private String ownerUnit;
    /**
     * 数据管理用户
     */
    private Long ownerId;



}

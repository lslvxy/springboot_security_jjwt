package com.jk.fish.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;


/**
 * com.jk.fish.entity
 *
 * @author lise
 * @comment 鱼类早期资源测点环境因子表
 * @date 2018-12-10 10:22
 * <p>
 * com.jk.fish.entity
 * @author lise
 * @comment
 * @date 2018-12-10 10:22
 */

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
public class EarlyWaterQualit extends BaseEntity {


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
     * 测点名称
     */
    private String statName;
    /**
     * 监测日期
     */
    private java.util.Date monitDate;
    /**
     * 水温
     */
    private String waterTemp;
    /**
     * pH值
     */
    private Long ph;
    /**
     * 溶解氧
     */
    private Double dissOxyg;
    /**
     * 溶解氧指标方法
     */
    private String dissOxygMethod;
    /**
     * 电导率
     */
    private Double conductivi;
    /**
     * 电导率指标方法
     */
    private String conductiviMethod;
    /**
     * 透明度
     */
    private Double transparen;
    /**
     * 透明度指标方法
     */
    private String transparenMethod;
    /**
     * 数据入库单位
     */
    private String ownerUnit;
    /**
     * 数据管理用户
     */
    private Long ownerId;



}

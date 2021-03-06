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
public class MonitPhy extends BaseEntity {


    /**
     * 监测人员
     */
    private String monitPerson;
    /**
     * 浮游植物名称
     */
    private String phyName;
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
     * 监测日期
     */
    private java.util.Date monitDate;
    /**
     * 监测时间
     */
    private java.util.Date monitTime;
    /**
     * 测线
     */
    private String locat;
    /**
     * 水深
     */
    private Double waterDep;
    /**
     * 数量
     */
    private Double quantity;
    /**
     * 生物量
     */
    private Double biomass;
    /**
     * 透明度
     */
    private Double transparen;
    /**
     * 数据入库单位
     */
    private String ownerUnit;
    /**
     * 数据管理用户
     */
    private Long ownerId;



}

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
public class WaterHyData extends BaseEntity {


    /**
     * 站名
     */
    private String statName;
    /**
     * 监测日期
     */
    private java.util.Date monitDate;
    /**
     * 监测时间
     */
    private java.util.Date monitTime;
    /**
     * 水位
     */
    private Double waterLev;
    /**
     * 涨落情况
     */
    private String levRisADown;
    /**
     * 流量
     */
    private Double waterFlo;
    /**
     * 警戒水位
     */
    private Double alarmWaterLev;

}

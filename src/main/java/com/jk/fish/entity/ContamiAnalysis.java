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
public class ContamiAnalysis extends BaseEntity {


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
     * 取样部位
     */
    private String tissue;
    /**
     * 铜
     */
    private Double cu;
    /**
     * 铜指标方法
     */
    private String cuMethod;
    /**
     * 锌
     */
    private Double zn;
    /**
     * 锌指标方法
     */
    private String znMethod;
    /**
     * 铅
     */
    private Double pb;
    /**
     * 铅指标方法
     */
    private String pbMethod;
    /**
     * 镉
     */
    private Double cd;
    /**
     * 镉指标方法
     */
    private String cdMethod;
    /**
     * 汞
     */
    private Double hg;
    /**
     * 汞指标方法
     */
    private String hgMethod;
    /**
     * 砷
     */
    private Double ars;
    /**
     * 砷指标方法
     */
    private String arsMethod;
    /**
     * 数据入库单位
     */
    private String ownerUnit;
    /**
     * 数据管理用户
     */
    private Long ownerId;


}

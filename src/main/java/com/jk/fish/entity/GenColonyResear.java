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
public class GenColonyResear extends BaseEntity {


    /**
     * 中文鱼名
     */
    private String fishName;
    /**
     * 年分
     */
    private String year;
    /**
     * 地点
     */
    private String location;
    /**
     * 样本量
     */
    private String sampleNum;
    /**
     * 补充描述
     */
    private String description;
    /**
     * 数据类型
     */
    private String dType;
    /**
     * 单倍型数量
     */
    private String numSimple;
    /**
     * 突变位点总数量
     */
    private Long totalNum;
    /**
     * 单倍型多样性
     */
    private String diversitySimple;
    /**
     * 核苷酸多样性
     */
    private String diversityNucle;
    /**
     * 等位基因数量
     */
    private String numAllele;
    /**
     * 观测杂合度Ho
     */
    private String obserHeter;
    /**
     * 预期杂合度He
     */
    private String expectHeter;
    /**
     * 数据入库单位
     */
    private String ownerUnit;
    /**
     * 数据管理用户
     */
    private Long ownerId;



}

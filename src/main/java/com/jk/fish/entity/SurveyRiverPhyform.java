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
public class SurveyRiverPhyform extends BaseEntity {


    /**
     * 河道深
     */
    private String channelDepth;
    /**
     * 堤岸高
     */
    private Double embankmentHeight;
    /**
     * 漫滩宽
     */
    private Double floodplainWidth;
    /**
     * 漫滩长
     */
    private Double floodplainLength;
    /**
     * 蜿蜒度
     */
    private Double angle;
    /**
     * 流态类型定量描述
     */
    private Double flowPatternValue;
    /**
     * 流态类型定性描述
     */
    private String flowPatternRemark;
    /**
     * 调查日期
     */
    private java.util.Date monitDate;
    /**
     * 调查人员
     */
    private String monitPerson;
    /**
     * 调查单位
     */
    private String monitUnitName;
    /**
     * 优势底质类型
     */
    private String sedimentType;
    /**
     * 护岸形式
     */
    private String protectionType;
    /**
     * 河岸坡度
     */
    private Double riverSideAngle;
    /**
     * 边滩植被覆盖率
     */
    private Double vegetationCoverage;
    /**
     * 数据入库单位
     */
    private String ownerUnit;
    /**
     * 数据管理用户
     */
    private Long ownerId;

    /**
     * 复杂性
     */
    private String complexity;
    /**
     * 渠化长度比例
     */
    private Double channelizationRatio;
    /**
     * 侵蚀面积比例
     */
    private Double erosionAreaRatio;
    /**
     * 种类数量
     */
    private String sedimentCount;
    /**
     * 泥沙覆盖率
     */
    private Double siltCoverage;
    /**
     * 自然的水力操纵
     */
    private String naturalControl;
    /**
     * 非自然的水力操纵
     */
    private String unNaturalControl;
    /**
     * 河道湿润率
     */
    private Double channelWetRate;
    /**
     * 流量
     */
    private Double flow;
    /**
     * 平均水深
     */
    private Double waterDepth;
    /**
     * 河流名称
     */
    private String riverName;
    /**
     * 河段编号
     */
    private String riverCode;
    /**
     * 河段长度
     */
    private Double riverLength;
    /**
     * 采样点编号
     */
    private Long siteId;
    /**
     * 中心经度
     */
    private Double X;
    /**
     * 中心纬度
     */
    private Double Y;
    /**
     * 采样点河宽
     */
    private Double diteWidth;

}

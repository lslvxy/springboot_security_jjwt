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
public class SurveyRiverSide extends BaseEntity {


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
     * 采样点河宽
     */
    private Double siteWidth;
    /**
     * 中心经度
     */
    private Double X;
    /**
     * 中心纬度
     */
    private Double Y;
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
     * 基质类型
     */
    private String sedimentType;
    /**
     * 人工护岸类型
     */
    private String protectionType;
    /**
     * 河岸坡度
     */
    private Double riverSideAngle;
    /**
     * 侵蚀程度
     */
    private String erosion;
    /**
     * 河岸宽度
     */
    private Double riverSideWidth;
    /**
     * 植被覆盖度
     */
    private Double vegetationCoverage;
    /**
     * 植被结构定量描述
     */
    private String plantStructureValue;
    /**
     * 植被结构定性描述
     */
    private String plantStructureType;
    /**
     * 植被分布
     */
    private String plantDistribute;
    /**
     * 缓冲带宽度
     */
    private Double bufferWidth;
    /**
     * 植被优势种
     */
    private String dominant;
    /**
     * 植被生物量
     */
    private Double plantAmount;
    /**
     * 植物生长基质总特征
     */
    private String plantAttribute;
    /**
     * 植物生长基质特征采样量
     */
    private Long plantSampleAmount;
    /**
     * 河岸带土地利用类型
     */
    private String landUse;
    /**
     * 人类干扰活动
     */
    private String humanAction;
    /**
     * 岸坡改造工程
     */
    private String riverSideProject;
    /**
     * 数据入库单位
     */
    private String ownerUnit;
    /**
     * 数据管理用户
     */
    private Long ownerId;


}

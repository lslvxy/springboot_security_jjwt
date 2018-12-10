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
public class GenMolecuMaker extends BaseEntity {


    /**
     * 唯一编号
     */
    private String genGuid;
    /**
     * 监测人员
     */
    private String monitPersion;
    /**
     * 样本测量编号
     */
    private String measureNo;
    /**
     * 中文鱼名
     */
    private String fishName;
    /**
     * 分子标记软件
     */
    private String software;
    /**
     * 文献或来源
     */
    private String reference;
    /**
     * 数据入库单位
     */
    private String ownerUnit;
    /**
     * 数据管理用户
     */
    private Long ownerId;



}

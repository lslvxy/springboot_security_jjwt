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
public class GenSampleInfo extends BaseEntity {


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
     * 序列
     */
    private String sequence;
    /**
     * 基因型
     */
    private String gene;
    /**
     * 数据入库单位
     */
    private String ownerUnit;
    /**
     * 数据管理用户
     */
    private Long ownerId;



}

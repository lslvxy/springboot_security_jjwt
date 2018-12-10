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
public class EarlyBiolog extends BaseEntity {


    /**
     * 唯一编号
     */
    private String earGuid;
    /**
     * 监测人员
     */
    private String monitPersion;
    /**
     * 监测编号
     */
    private String monitNo;
    /**
     * 鱼的测量编号
     */
    private String fishNo;
    /**
     * 中文鱼名
     */
    private String fishName;
    /**
     * 发育期
     */
    private Double developEgg;
    /**
     * 鱼卵卵径
     */
    private Double diamEgg;
    /**
     * 鱼卵卵膜径
     */
    private Double diamEggMemb;
    /**
     * 全长
     */
    private Double totalLeng;
    /**
     * 色素性状
     */
    private String charPig;
    /**
     * 胚胎性状
     */
    private String charEmbr;
    /**
     * 备注
     */
    private String remark;
    /**
     * 数据入库单位
     */
    private String ownerUnit;
    /**
     * 数据管理用户
     */
    private Long ownerId;



}

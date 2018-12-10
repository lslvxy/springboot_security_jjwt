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
public class CatchBiolog extends BaseEntity {


    /**
     * 唯一编号
     */
    private String catGuid;
    /**
     * 监测人员
     */
    private String monitPersion;
    /**
     * 渔获物基础信息测量编号
     */
    private String monitNo;
    /**
     * 性别
     */
    private String sex;
    /**
     * 性腺发育期
     */
    private String periGona;
    /**
     * 性腺重
     */
    private Double gonaWeigh;
    /**
     * 卵巢样品重
     */
    private Double sampleWeigh;
    /**
     * 样品卵数
     */
    private Double fecundity;
    /**
     * 绝对怀卵量
     */
    private Double absFecundity;
    /**
     * 卵径
     */
    private Double eggDiam;
    /**
     * 食物湿重
     */
    private Double wetWeigh;
    /**
     * 充塞度
     */
    private Double pepDegree;
    /**
     * 肠长
     */
    private Double intestLeng;
    /**
     * 年龄材料
     */
    private String ageMateria;
    /**
     * 年龄
     */
    private Double age;
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

package com.jk.fish.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * com.jk.fish.entity
 *
 * @author lise
 * @comment 鱼名录信息表
 * @date 2018-12-10 10:22
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BaseFish extends BaseEntity {
    /**
     * 种名
     */
    private String species;
    /**
     * 俗名
     */
    private String commname;
    /**
     * 拉丁种名
     */
    private String latinSpecies;
    /**
     * 亚种名
     */
    private String subspecies;
    /**
     * 拉丁亚种名
     */
    private String latinSubspecies;
    /**
     * 属名
     */
    private String genus;
    /**
     * 拉丁属名
     */
    private String latinGenus;
    /**
     * 亚属名
     */
    private String subgenus;
    /**
     * 拉丁亚属名
     */
    private String latinSubgenus;
    /**
     * 总科名
     */
    private String superfamily;
    /**
     * 拉丁总科名
     */
    private String latinSuperfamily;
    /**
     * 科名
     */
    private String family;
    /**
     * 拉丁科名
     */
    private String latinFamily;
    /**
     * 亚科名
     */
    private String subfamily;
    /**
     * 拉丁亚科名
     */
    private String latinSubfamily;
    /**
     * 总目名
     */
    private String superoder;
    /**
     * 拉丁总目名
     */
    private String latinSuperoder;
    /**
     * 目名
     */
    private String mainOrder;
    /**
     * 拉丁目名
     */
    private String latinMainOrder;
    /**
     * 亚目名
     */
    private String suborder;
    /**
     * 拉丁亚目名
     */
    private String latinSuborder;
    /**
     * 总纲名
     */
    private String superclass;
    /**
     * 拉丁总纲名
     */
    private String latinSuperclass;
    /**
     * 纲名
     */
    private String mainClass;
    /**
     * 拉丁纲名
     */
    private String latinMainClass;
    /**
     * 亚纲名
     */
    private String subclass;
    /**
     * 拉丁亚纲名
     */
    private String latinSubclass;
    /**
     * 门名
     */
    private String phylum;
    /**
     * 拉丁门名
     */
    private String latinPhylum;
    /**
     * 亚门名
     */
    private String subphylum;
    /**
     * 拉丁亚门名
     */
    private String latinSubphylum;
    /**
     * 是否为长江上游特有鱼类
     */
    private String endemismYangtze;
    /**
     * 生活习性
     */
    private String lifehabit;
    /**
     * 资源现状
     */
    private String statusResource;
    /**
     * 地理分布
     */
    private String distribution;
    /**
     * 图片
     */
    private String picture;
    /**
     * 备注
     */
    private String remark;
    /**
     * 数据提供单位
     */
    private String dataProvider;

}

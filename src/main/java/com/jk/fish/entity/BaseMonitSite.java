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
public class BaseMonitSite extends BaseEntity {


    /**
     * 名称
     */
    private String name;
    /**
     * 所在江河
     */
    private String sectRive;
    /**
     * 河流一侧起始点经度
     */
    private Double beEastLo1;
    /**
     * 河流一侧起始点纬度
     */
    private Double beNorthLa1;
    /**
     * 河流另一侧起始点经度
     */
    private Double beEastLo2;
    /**
     * 河流另一侧起始点纬度
     */
    private Double beNorthLa2;
    /**
     * 河流一侧终止点经度
     */
    private Double endEastLo1;
    /**
     * 河流一侧终止点纬度
     */
    private Double endNorthLa1;
    /**
     * 河流另一侧终止点经度
     */
    private Double endEastLo2;
    /**
     * 河流另一侧终止点纬度
     */
    private Double endNorthLa2;
    /**
     * 所属县渔船数量
     */
    private Double fisherboat;
    /**
     * 备注
     */
    private String remark;

}

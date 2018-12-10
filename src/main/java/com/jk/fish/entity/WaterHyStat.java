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
public class WaterHyStat extends BaseEntity {


    /**
     * 站码
     */
    private String statCode;
    /**
     * 名称
     */
    private String name;
    /**
     * 所在流域
     */
    private String basin;
    /**
     * 所在行政区
     */
    private String adminArea;
    /**
     * 所在江河
     */
    private String sectRive;
    /**
     * 经度
     */
    private String eastLo;
    /**
     * 纬度
     */
    private String northLa;

}

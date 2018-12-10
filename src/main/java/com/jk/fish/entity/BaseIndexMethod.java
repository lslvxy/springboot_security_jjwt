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
public class BaseIndexMethod extends BaseEntity {


    /**
     * 类型
     */
    private String methodType;
    /**
     * 名称
     */
    private String name;
    /**
     * 主要仪器
     */
    private String keyInstrument;
    /**
     * 方法描述
     */
    private String methodDescription;
    /**
     * 结果量纲
     */
    private String unit;
    /**
     * 方法来源
     */
    private String methodSource;

}

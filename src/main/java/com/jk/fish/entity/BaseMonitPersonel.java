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
public class BaseMonitPersonel extends BaseEntity {


    /**
     * 监测单位
     */
    private String monitUnitName;
    /**
     * 监测人员
     */
    private String monitPerson;
    /**
     * 数据校核人员
     */
    private String auditor;

}

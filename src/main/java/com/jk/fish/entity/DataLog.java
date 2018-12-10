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
public class DataLog extends BaseEntity {


    /**
     * 用户编号
     */
    private String userGuid;
    /**
     * 操作
     */
    private String work;
    /**
     * 操作时间
     */
    private java.util.Date workTime;
    /**
     * 表名
     */
    private String tableName;
    /**
     * 中文表名
     */
    private String tableNameCn;
    /**
     * 记录行数
     */
    private Long recordCount;

}

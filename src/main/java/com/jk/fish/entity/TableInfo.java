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
public class TableInfo extends BaseEntity {


    /**
     * 子库
     */
    private String dataBase;
    /**
     * 表序号
     */
    private String tableIndex;
    /**
     * 表名
     */
    private String tableName;
    /**
     * 中文表名
     */
    private String tableNameCn;

}

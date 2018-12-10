package com.jk.fish.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.jk.fish.common.Constants;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * com.jk.fish.entity
 *
 * @author lise
 * @comment BaseEntity
 * @date 2018-12-10 10:35
 */
@Data
@Accessors(chain = true)
public class BaseEntity {
    /**
     * ID
     */
    private Long id;

    /**
     * 操作时间
     */

    private Date operateTime;

    /**
     * 通用数据状态 1正常
     */
    private Integer status = Constants.STATUS_NORMAL;

    /**
     * 删除状态,1正常,0删除
     */
    @TableLogic
    private Integer deleteFlag = Constants.DELETE_ISNOTDELETE;

}

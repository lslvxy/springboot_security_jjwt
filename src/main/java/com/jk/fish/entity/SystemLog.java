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
public class SystemLog extends BaseEntity {


    /**
     * 用户编号
     */
    private String userGuid;
    /**
     * 用户IP
     */
    private String ip;
    /**
     * 用户电脑名称
     */
    private String computer;
    /**
     * 登录时间
     */
    private java.util.Date loginTime;
    /**
     * 退出时间
     */
    private java.util.Date logoutTime;

}

package com.jk.fish.common;

/**
 * com.jk.sense.core.base
 *
 * @author lise
 * @comment 系统常量
 * @date 2018/10/23 5:18 PM
 */

public interface Constants {
    /**
     * 请求号header标识
     */
    String TOKEN_NAME = "Authorization";

    /**
     * 密钥
     */
    String AUTH_SECRET = "ISENSE_SECRET_QWER!@#$qwer";
    String AUTH_USER_KEY = "ISENSE_USER_KEY";
    /**
     * 用户主题
     */
    String AUTH_USER_SUBJECT = "ISENSE_USER_SUBJECT";
    /**
     * 过期时间
     */
    Long AUTH_EXPIRATION = 604800L;

    /**
     * header中的spanId，传递规则：request header中传递本服务的id
     */
    String SPAN_ID_HEADER_NAME = "Span-Id";

    /**
     * 身份标识的header名称,用于传给下游服务获取用户id
     */
    String IDENTITY_HEADER = "USER-ID";

    /**
     * 默认分页条数
     */
    Integer PAGE_SIZE = 10;

    /**
     * 默认正常状态码
     */
    Integer DEFAULT_SUCCESS_CODE = 1;
    /**
     * 默认错误状态码
     */
    Integer DEFAULT_ERROR_CODE = 0;
    /**
     * 用户未登录状态码
     */
    Integer NOT_LOGIN = 403;

    String DEFAULT_SUCCESS_MESSAGE = "请求成功";

    String DEFAULT_ERROR_MESSAGE = "网络异常";
    /**
     * 正常状态
     */
    Integer STATUS_NORMAL = 1;
    /**
     * 禁用
     */
    Integer STATUS_DISABLE = 0;
    /**
     * 未删除
     */
    Integer DELETE_ISNOTDELETE = 1;
    /**
     * 已删除
     */
    Integer DELETE_ISDELETE = 0;


}

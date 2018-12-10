package com.jk.fish.common;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Map;

/**
 * com.jk.sense.core.base
 *
 * @author lise
 * @comment
 * @date 2018/10/23 5:17 PM
 */

@Data
@ToString
@Accessors(chain = true)
public class ResultJson<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;


    public static <T> ResultJson success() {
        return new ResultJson<T>().setCode(Constants.DEFAULT_SUCCESS_CODE).setMsg(Constants.DEFAULT_SUCCESS_MESSAGE);
    }

    public static <T> ResultJson success(T data) {
        return new ResultJson<T>().setCode(Constants.DEFAULT_SUCCESS_CODE).setMsg(Constants.DEFAULT_SUCCESS_MESSAGE).setData(data);
    }

    public static <T> ResultJson success(Integer code, String msg, T data) {
        return new ResultJson<T>().setCode(code).setMsg(msg).setData(data);
    }


    public static <T> ResultJson error() {
        return new ResultJson<T>().setCode(Constants.DEFAULT_ERROR_CODE).setMsg(Constants.DEFAULT_ERROR_MESSAGE);

    }

    public static <T> ResultJson error(String msg) {
        return new ResultJson<T>().setCode(Constants.DEFAULT_ERROR_CODE).setMsg(msg);
    }

    public static <T> ResultJson error(Integer code, String msg) {
        return new ResultJson<T>().setCode(code).setMsg(msg);
    }

    public static <T> ResultJson error(Integer code, String msg, T data) {
        return new ResultJson<T>().setCode(code).setMsg(msg).setData(data);
    }
}

package com.jk.fish.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * com.jk.fish.util
 *
 * @author lise
 * @comment
 * @date 2018-12-10 16:03
 */
public class PasswordUtil {


    public static PasswordEncoder builder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * 密码加密
     *
     * @param pwd 需要加密的密码
     * @return 加密后的密码
     */
    public static String encode(String pwd) {
        return builder().encode(pwd);
    }

    /**
     * 判断密码是否相等
     *
     * @param rawPassword     需要判断的密码
     * @param encodedPassword 加密后的密码
     * @return ture or false
     */
    public static boolean matches(String rawPassword, String encodedPassword) {
        return builder().matches(rawPassword, encodedPassword);
    }

}

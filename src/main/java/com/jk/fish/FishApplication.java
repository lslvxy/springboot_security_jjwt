package com.jk.fish;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * com.jk.fish
 *
 * @author lise
 * @comment
 * @date 2018-12-10 13:04
 */
@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.jk.fish.mapper")
//@ComponentScan(basePackages = {
//        "com.jk.fish.config",
//        "com.jk.fish.controller",
//        "com.jk.fish.service",
//        "com.jk.fish.util"})
public class FishApplication {
    public static void main(String[] args) {
        SpringApplication.run(FishApplication.class);
    }
}

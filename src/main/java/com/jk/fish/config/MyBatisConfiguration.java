package com.jk.fish.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * com.jk.fish.config
 *
 * @author lise
 * @comment myBatis配置
 * @date 2018-12-10 13:37
 */
@Configuration
public class MyBatisConfiguration {
    /**
     * 逻辑删除组件
     * @return
     */
    @Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }
}

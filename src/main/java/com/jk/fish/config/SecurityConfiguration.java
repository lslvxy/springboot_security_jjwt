package com.jk.fish.config;

import com.alibaba.fastjson.JSON;
import com.jk.fish.common.ResultJson;
import com.jk.fish.filter.JWTAuthenticationFilter;
import com.jk.fish.service.IUserService;
import com.jk.fish.util.JwtUtil;
import com.jk.fish.util.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * com.jk.fish.config
 *
 * @author lise
 * @comment
 * @date 2018-12-10 14:01
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private IUserService userService;

    @Autowired
    private JwtUtil jwtUtil;

    /**
     * 登录认证需要排除的url
     */
    private List<String> excludes = new ArrayList<>();

    @Autowired
    public void configureAuthentication(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.userDetailsService(this.userService).passwordEncoder(passwordEncoder());
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry urlRegistry = http.csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.OPTIONS, "/**").permitAll();
        excludes.forEach(url -> urlRegistry.antMatchers(url).permitAll());
        urlRegistry
                .antMatchers(HttpMethod.POST, "/user/login").permitAll()
                .antMatchers("/ok").permitAll()
                .anyRequest().authenticated()
                .and().headers().cacheControl();

        http.addFilterBefore(new JWTAuthenticationFilter(userService, jwtUtil), UsernamePasswordAuthenticationFilter.class);
        http.exceptionHandling().authenticationEntryPoint((req, res, ex) -> {
            res.setHeader("Access-Control-Allow-Origin", "*");
            res.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            res.setContentType("application/json;charset=utf-8");
            res.getWriter().write(JSON.toJSONString(ResultJson.error(HttpServletResponse.SC_UNAUTHORIZED, "认证失败")));
        }).accessDeniedHandler((req, res, ex) -> {
            res.setHeader("Access-Control-Allow-Origin", "*");
            res.setStatus(HttpServletResponse.SC_FORBIDDEN);
            res.setContentType("application/json;charset=utf-8");
            res.getWriter().write(JSON.toJSONString(ResultJson.error(HttpServletResponse.SC_FORBIDDEN, "没有权限")));
        });

    }


    //重写密码加密方法
    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordUtil.builder();
    }

    @Bean(name = BeanIds.AUTHENTICATION_MANAGER)
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}

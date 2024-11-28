package com.quanxiaoha.weblog.admin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author : Kanade
 * @date: 2024-11-27 15:47
 * @description: Spring Security 配置类
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .mvcMatchers("/admin/**").authenticated() //认证所有以 /admin 未前缀的 URL 资源
                .anyRequest().permitAll().and() //其他都需要放行，无需认证
                .formLogin().and()  //使用表单登录
                .httpBasic();   //使用 HTTP Basic 认证
    }
}

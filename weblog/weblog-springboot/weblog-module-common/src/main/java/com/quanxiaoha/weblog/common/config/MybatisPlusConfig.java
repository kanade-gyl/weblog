package com.quanxiaoha.weblog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Kanade
 * @date: 2024-11-25 21:39
 * @description: Mybatis Plus 配置文件
 **/
@Configuration
@MapperScan("com.quanxiaoha.weblog.common.domain.mapper")
public class MybatisPlusConfig {
}

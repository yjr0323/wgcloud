package com.agent.wgcloud.mbg.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: wgcloud
 * @description:
 * @author: Yjr
 * @create: 2019-08-21 14:56
 **/
@Configuration
@MapperScan("com.agent.wgcloud.mbg.mapper")
public class MyBatisConfig {
}

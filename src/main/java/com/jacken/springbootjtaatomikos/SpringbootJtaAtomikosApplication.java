package com.jacken.springbootjtaatomikos;

import com.jacken.springbootjtaatomikos.datasource.Test2DBConfig;
import com.jacken.springbootjtaatomikos.datasource.TestDBConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * 使用jta atomikos解决分布式事务问题
 * 示例：同时向不同数据库中插入数据
 */
@SpringBootApplication
@EnableConfigurationProperties(value = { TestDBConfig.class, Test2DBConfig.class })
public class SpringbootJtaAtomikosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJtaAtomikosApplication.class, args);
    }

}

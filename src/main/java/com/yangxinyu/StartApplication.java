package com.yangxinyu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author : 星宇
 * @since : 2023/05/08
 */
@SpringBootApplication
@MapperScan("com.yangxinyu.app.mapper")
@EnableCaching
public class StartApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class,args);
    }
}

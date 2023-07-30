package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 整合mybatis plus
 * 1、导入依赖
 * 2、配置
 *      （1）配置数据源
 *              导入驱动、在application.yml配置数据源
 *      （2）配置mybatisplus
 *      1、使用MapperScan
 *      2、告诉mybatis-plus，sql映射文件
 */
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

}

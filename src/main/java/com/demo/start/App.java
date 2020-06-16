package com.demo.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * App
 *
 *
 * ComponentScan(basePackages = "com.demo")  这里指定你要扫描的包及其子包子类
 * MapperScan("com.demo.mapper") 扫描：该包下相应的class,主要是MyBatis的持久化类，
 * 这里用的是mapper的扫描，不是mybatis自身扫描
 *
 */
@ComponentScan(basePackages = "com.demo")
@SpringBootApplication
@MapperScan("com.demo.mapper")
@EnableTransactionManagement
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

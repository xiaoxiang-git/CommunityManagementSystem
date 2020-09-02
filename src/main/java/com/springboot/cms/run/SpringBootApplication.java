package com.springboot.cms.run;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * SpringBoot启动类
 *
 * @author YuanhuiHo
 */
@org.springframework.boot.autoconfigure.SpringBootApplication
@ComponentScan("com.springboot.cms")
@MapperScan("com.springboot.cms.dao")
@EnableTransactionManagement
public class SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class);
    }

}

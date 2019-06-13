package com.warape.mybatispuls;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@MapperScan("com.warape.mybatispuls.mapper*")
@EnableTransactionManagement
@SpringBootApplication
public class MybatisPulsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPulsApplication.class, args);
    }

}

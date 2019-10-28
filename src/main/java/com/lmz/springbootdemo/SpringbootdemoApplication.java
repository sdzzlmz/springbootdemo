package com.lmz.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lmz.springbootdemo.dao")
public class SpringbootdemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootdemoApplication.class, args);
        System.out.println("程序正在运行");
    }

}

package com.hjh.springboot_ems;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hjh.springboot_ems.mapper")
@SpringBootApplication
public class SpringbootEmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEmsApplication.class, args);
    }

}

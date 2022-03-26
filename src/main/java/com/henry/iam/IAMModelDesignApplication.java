package com.henry.iam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.henry.iam.mapper")
public class IAMModelDesignApplication {
    public static void main(String[] args) {
        SpringApplication.run(IAMModelDesignApplication.class, args);
    }

}

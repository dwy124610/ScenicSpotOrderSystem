package com.yunhe.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/9 17:27
 */
@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.yunhe.common.mapper")
public class UserApplication {
    public static void main(String[] args) {
            SpringApplication.run(UserApplication.class , args);
        }
}

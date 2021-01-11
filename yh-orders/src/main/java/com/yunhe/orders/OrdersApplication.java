package com.yunhe.orders;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/11 11:19
 */
@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.yunhe.common.mapper")
public class OrdersApplication {
    public static void main(String[] args) {
            SpringApplication.run(OrdersApplication.class , args);
        }
}

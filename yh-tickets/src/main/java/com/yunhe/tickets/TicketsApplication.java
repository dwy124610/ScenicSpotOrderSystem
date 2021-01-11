package com.yunhe.tickets;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/11 10:47
 */
@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.yunhe.common.mapper")
public class TicketsApplication {
    public static void main(String[] args) {
            SpringApplication.run(TicketsApplication.class , args);
        }
}

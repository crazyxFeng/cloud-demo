package com.demo.xf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: xiong Feng
 * @Date: 2019/4/10 14:00
 * @Description: Feign是自带断路器的
 */
@SpringBootApplication
@EnableFeignClients
//@ComponentScan(basePackages = {"com.demo.xf", "com.demo.xf.service.impl"})
public class FeignApplication {
    public static void main(String[] args){
        SpringApplication.run(FeignApplication.class, args);
    }
}

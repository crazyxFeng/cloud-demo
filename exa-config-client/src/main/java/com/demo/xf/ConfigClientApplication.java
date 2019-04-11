package com.demo.xf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: xiong Feng
 * @Date: 2019/4/11 11:20
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication {
    public static void main(String[] args){
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}

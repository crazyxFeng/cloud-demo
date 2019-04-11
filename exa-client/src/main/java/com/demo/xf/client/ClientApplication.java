package com.demo.xf.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: xiong Feng
 * @Date: 2019/4/9 14:47
 * @Description:
 */
@EnableEurekaClient
@SpringBootApplication
public class ClientApplication {
    public static void main(String[] args){
        SpringApplication.run(ClientApplication.class,args);
    }
}

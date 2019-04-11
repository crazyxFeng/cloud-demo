package com.demo.xf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: xiong Feng
 * @Date: 2019/4/10 10:46
 * @Description:
 */
// @EnableEurekaClient这两个注解作用一样，都是向服务注册中心提供服务
@EnableDiscoveryClient
@SpringBootApplication
public class Client1Application {
    public static void main(String[] args){
        SpringApplication.run(Client1Application.class, args);
    }
}

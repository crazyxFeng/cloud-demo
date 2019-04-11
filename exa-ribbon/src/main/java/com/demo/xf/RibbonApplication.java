package com.demo.xf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: xiong Feng
 * @Date: 2019/4/10 13:17
 * @Description: ribbon是一个负载均衡客户端，
 * 可以很好的控制htt和tcp的一些行为。Feign默认集成了ribbon
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class RibbonApplication {
    public static void main(String[] args){
        SpringApplication.run(RibbonApplication.class,args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}

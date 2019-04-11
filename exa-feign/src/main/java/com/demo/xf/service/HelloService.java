package com.demo.xf.service;

import com.demo.xf.service.impl.HelloServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: xiong Feng
 * @Date: 2019/4/10 14:01
 * @Description: 使用Feign，只需要创建一个接口并注解，它具有可插拔的注解特性
 * Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。
 * 简而言之：
 *
 * Feign 采用的是基于接口的注解
 * Feign 整合了ribbon
 * 引入的依赖是spring-cloud-starter-openfeign
 */
// 下面的fallback是实现类的字节码文件
@FeignClient(value = "exa-client", fallback = HelloServiceImpl.class)
public interface HelloService {

    @GetMapping("/hello")
    String callExaClientHi(@RequestParam(required = false, value = "name") String name);
}

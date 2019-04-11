package com.demo.xf.service.impl;

import com.demo.xf.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: xiong Feng
 * @Date: 2019/4/10 16:28
 * @Description: 在ribbon中使用断路器来访问其他服务
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Resource
    RestTemplate restTemplate;

    /*
     * 访问成功的方法和访问失败的方法参数必须一致
     * 就是hiService和hiError的参数必须一样
     */
    @Override
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://exa-client/hello?name="+name, String.class);
    }

    @Override
    public String hiError(String name) {
        return "sorry "+name+",service is closed temporary";
    }
}

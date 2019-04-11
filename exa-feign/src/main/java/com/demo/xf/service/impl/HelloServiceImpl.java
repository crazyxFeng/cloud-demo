package com.demo.xf.service.impl;

import com.demo.xf.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @Author: xiong Feng
 * @Date: 2019/4/10 16:47
 * @Description: HelloServiceImpl需要实现HelloService 接口，并注入到Ioc容器中
 */
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String callExaClientHi(String name) {
        return "sorry,"+name+" this service is down！";
    }
}

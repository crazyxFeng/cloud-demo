package com.demo.xf.client.service.impl;

import com.demo.xf.client.service.HelloService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author: xiong Feng
 * @Date: 2019/4/10 11:13
 * @Description:
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Value("${server.port}")
    private String port;

    @Override
    public String sayHello(String name) {
        return name+",你好啊!我来自端口:"+port;
    }
}

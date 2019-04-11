package com.demo.xf.web;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: xiong Feng
 * @Date: 2019/4/10 11:15
 * @Description:
 */
@RestController
public class HelloController {
    @Resource
    private EurekaClient client;

    @Value("${server.port}")
    String port;

    @GetMapping("/sayHi")
    public String sayHi(){
        InstanceInfo instanceInfo = client.getNextServerFromEureka("exa-client", false);
        return instanceInfo.getHostName();
    }

    @GetMapping("/hello")
    public String sayHi(@RequestParam(required = false) String name){
        if (name == null || "".equals(name)){
            name = "wenyuntian";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("hello ").append(name).append(" i am from ").append(port);
        return sb.toString();
    }
}

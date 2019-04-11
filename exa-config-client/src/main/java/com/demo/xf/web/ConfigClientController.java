package com.demo.xf.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xiong Feng
 * @Date: 2019/4/11 11:22
 * @Description:
 */
@RestController
public class ConfigClientController {

    @Value("${xf.env}")
    String env;

    @Value("${xf.name}")
    String name;
    @Value("${xf.age}")
    String age;

    @GetMapping(value = "/hi")
    public String hi(){
        return "我的名字是:"+name+",年龄是:"+age+",env:"+env;
    }
}

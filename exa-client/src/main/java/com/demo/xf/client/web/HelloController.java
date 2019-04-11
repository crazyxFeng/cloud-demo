package com.demo.xf.client.web;

import com.demo.xf.client.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xiong Feng
 * @Date: 2019/4/9 14:49
 * @Description:
 */
@RestController
public class HelloController {
    private HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false, value = "name") String name){
        if (name == null || "".equals(name)){
            name = "alex";
        }
        return helloService.sayHello(name);
    }
}

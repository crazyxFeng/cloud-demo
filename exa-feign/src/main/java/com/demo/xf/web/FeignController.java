package com.demo.xf.web;

import com.demo.xf.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: xiong Feng
 * @Date: 2019/4/10 14:03
 * @Description:
 */
@RestController
public class FeignController {
    @Resource
    HelloService helloService;

    @GetMapping("/hello")
    public String Hello(@RequestParam(required = false) String name){
        if (name == null || "".equals(name)){
            name = "alex";
        }
        return helloService.callExaClientHi(name);
    }
}

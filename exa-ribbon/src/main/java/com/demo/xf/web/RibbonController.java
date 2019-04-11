package com.demo.xf.web;

import com.demo.xf.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: xiong Feng
 * @Date: 2019/4/10 13:19
 * @Description: 依赖是spring-cloud-starter-netflix-ribbon
 */
@RestController
public class RibbonController {
    @Resource
    private RestTemplate restTemplate;

    private HelloService helloService;

    private RibbonController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hi")
    public String sayHi(){
        return restTemplate.getForObject("http://exa-client/hello?name=bob", String.class);
    }

    @GetMapping("/sayHi")
    public String ha(@RequestParam(value = "name") String name){
        return helloService.hiService(name);
    }
}

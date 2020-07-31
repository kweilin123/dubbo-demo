package com.wanggl.dubboconsumer.controller;

import com.wanggl.api.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @DubboReference(version = "${demo.service.version}")
    private HelloService helloService;
    @RequestMapping("/hello")
    public String hello(String name){

        return helloService.sayHi(name);
    }

}

package com.wanggl.api;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

@DubboService(interfaceName = "helloService",version = "${demo.service.version}")
public class HelloServiceImpl implements HelloService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHi(String name) {
        String s = String.format("[%s] : Hello, %s", serviceName, name);
        System.out.println(s);
        return s;
    }
}

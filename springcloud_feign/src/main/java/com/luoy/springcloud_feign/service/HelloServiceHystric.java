package com.luoy.springcloud_feign.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystric implements HelloService {
    @Override
    public String sayHiFromClientOne(String name) {

        return "soryy,"+name+",error happen";
    }
}

package com.springclouddemo.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/hello")
    public String index(){
//        List<String> services = discoveryClient.getServices();
//        System.out.println(services);
        return "Hello World";
    }
}

package com.example.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yuanping Zhang
 * @date
 */
@RestController
@RequestMapping("/client")
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

//    @GetMapping("/dc")
//    public String dc() throws InterruptedException {
//        Thread.sleep(5000L);
//        String services = "Services: " + discoveryClient.getServices();
//        System.out.println(services);
//        List<ServiceInstance> instances = discoveryClient.getInstances("eureka-client");
//        return services;
//    }

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "hello " + name;
    }
}

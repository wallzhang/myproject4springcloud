package com.wall.demo4consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/** 
* @Description: 测试远程通信
* @Author: zhang.zw
* @Date: 2021/1/25 
*/
@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @GetMapping("test/consumer/{id}")
    public String qryRemoteProductById(@PathVariable("id") int id){

        return restTemplate.getForObject("http://MY-PRODUCT-SERVER/product/" + id,String.class);
//        return restTemplate.getForObject("http://localhost:8081/product/" + id,String.class);
    }
}

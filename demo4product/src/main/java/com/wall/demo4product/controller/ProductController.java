package com.wall.demo4product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
* @Description: 测试请求类
* @Author: zhang.zw
* @Date: 2021/1/25
*/
@RestController
public class ProductController {

    @GetMapping("product/{id}")
    public String qryProductById(@PathVariable("id") int id){
        return "qry product " + id + " success";
    }
}

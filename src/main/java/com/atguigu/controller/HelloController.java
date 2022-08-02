package com.atguigu.controller;

import com.atguigu.properties.DataSourceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author： HX
 * @date: 2022/8/2
 * description
 */
@RestController
public class HelloController {
    @Autowired
    private DataSourceProperties dataSourceProperties;
//    @RequestMapping("/hello")
//    public String hello(String message) {
//        return "Hello spring boot";
//    }
    @RequestMapping(path = "/hello")
    public String sayHello() {
        System.out.println(dataSourceProperties);

        return  "Hello Spring Boot";
    }
}

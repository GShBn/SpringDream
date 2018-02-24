package com.example.demo.test1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 1.1 Spring Boot 之 HelloWorld详解
 *
 * @author ballsb
 * @date 2018/2/23
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello World Dream Spring Boot!";
    }
}

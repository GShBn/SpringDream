package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ballsb on 2018/2/23.
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello World Dream Spring Boot!";
    }
}

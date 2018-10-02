package com.example.controller;

import com.example.Springbootdemo.SpringbootDemoApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:pyt
 * @DATE:2018/9/29
 */

@RestController
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){

        return "hello,Spring Boot!";
    }

}

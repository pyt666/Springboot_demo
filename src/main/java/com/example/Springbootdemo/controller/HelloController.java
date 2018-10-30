package com.example.Springbootdemo.controller;

import com.example.Springbootdemo.dao.UserMapper;
import com.example.Springbootdemo.pojo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:pyt
 * @DATE:2018/9/29
 */
@Transactional
@RestController
@EnableAutoConfiguration
public class HelloController {
	@Autowired
	private UserMapper usermapper;

    @RequestMapping("/addtest")
    public String test(){
		User record = new User();
		record.setName("test");
		usermapper.insert(record);
		int i = 1/0;
        return "hello,Spring Boot!";
    }
	 @RequestMapping("/hello")
	    public String hello(){
	        return "hello,Spring Boot!";
	    }
}

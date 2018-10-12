package com.example.Springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringbootDemoApplication {
	//private final UserMapper userMapper;
	
	public SpringbootDemoApplication() {
		super();
		//this.userMapper = userMapper;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}
	public void run(String... args) {
        //System.out.println(this.userMapper.insert(new User()));
    }
	
}

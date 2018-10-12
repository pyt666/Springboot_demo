package com.example.Springbootdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication
public class SampleMybatisApplication implements CommandLineRunner {
	
	public SampleMybatisApplication() {
		super();
	}
	public static void main(String[] args) {
		SpringApplication.run(SampleMybatisApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//sSystem.out.println(this.userMapper.count());
		//System.out.println("hello");
	}

}

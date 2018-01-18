package com.spring.dependency.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="com.spring.dependency")
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionDemoApplication.class, args);
	}
}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//Scans all the packages
@ComponentScan(basePackages = {"com.example.controller","com.example.service"})

//Scans all the repository classes
@EnableJpaRepositories("com.example.repository")

//Scans all the entity classes
@EntityScan("com.example.entity")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans(value= {@ComponentScan("com.cts.service"), @ComponentScan("com.cts.restcontroller")})
public class BootRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootRestApplication.class, args);
	}
}

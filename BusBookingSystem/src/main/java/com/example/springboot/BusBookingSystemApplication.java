package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.springboot")


public class BusBookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusBookingSystemApplication.class, args);
	}

}

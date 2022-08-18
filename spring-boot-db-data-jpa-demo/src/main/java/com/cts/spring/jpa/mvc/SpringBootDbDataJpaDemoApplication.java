package com.cts.spring.jpa.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDbDataJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDbDataJpaDemoApplication.class, args);
		System.out.println("Done");
	}

}

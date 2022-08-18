package com.cts.demo;

import java.time.LocalDate;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("com.cts.demo")
public class BeanConfig {

	@Bean
	public Scanner scanner() {
		return new Scanner(System.in);
	}

	@Bean ("beanToday")
	public LocalDate today() {
		return LocalDate.now();
	}

}

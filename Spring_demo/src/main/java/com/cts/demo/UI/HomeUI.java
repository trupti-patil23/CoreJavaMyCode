package com.cts.demo.UI;

import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.cts.demo.service.Counter;
import com.cts.demo.service.GreetService;

@Component
public class HomeUI {
	
	@Autowired
	private Scanner scan;
	
	@Autowired
	@Qualifier ("AdvGreetService")
	private GreetService advGreetService;
	
	@Autowired
	@Qualifier ("greetService")
	private GreetService greetService;
	
	@Value ("My first spring app using @value annotation")
	private String applicationName ;
	
	@Value ("${demo.value}")
	private String property ;
	
	@Autowired
	private Counter c1;
	
	@Autowired
	private Counter c2;
	
	@Autowired
	private Counter c3;
	
	@Autowired
	private Counter c4;
	
	public HomeUI() {
		System.out.println("the object of HomeUI is constructed");
		System.out.println(scan);
	}

	@PostConstruct
	public void afterIniting() {
		System.out.println("The homeUI bean is initialized");
		System.out.println(scan);
	}
	
	public void run() {	
		
		System.out.println(applicationName);		
		System.out.println(property);
		
		//without instantiating to new Scanner() we can use its object cause of Autowire
		System.out.println("Enter your school name :");
		System.out.println("school name is "+scan.next());
				
		System.out.println("Name for greetAdvancedServiceImpl "+ advGreetService.greet("Riaan"));
		System.out.println("Name for greetServiceImpl "+ greetService.greet("Trupti"));
		
		System.out.println("-------------------------------Counter---------------");
		System.out.println(c1.next());
		System.out.println(c2.next());
		System.out.println(c3.next());
		System.out.println(c4.next());
		
	}	

	
}

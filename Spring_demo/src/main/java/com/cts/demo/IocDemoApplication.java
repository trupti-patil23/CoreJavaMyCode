package com.cts.demo;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.cts.demo.UI.HomeUI;

@Configuration
@PropertySource("classpath:application.properties")

public class IocDemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		
		//you can directly use bean as its method name
		System.out.println("Enter name");
		Scanner s1 = (Scanner) context.getBean("scanner");
		System.out.println("Name is "+s1.next());
		
		//You can assign name to Bean method
		System.out.println("Todays date is "+context.getBean("beanToday"));	
		
		//You can inject as a Class and use its method
		HomeUI ui = (HomeUI) context.getBean("homeUI");
		ui.run();
		
		
		
	}

}

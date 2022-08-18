package com.cts.demo.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service ("AdvGreetService")
public class greetAdvancedServiceImpl implements GreetService {

	@Override
	public String greet(String name) {
		
		String greeting="";			        
		int h = LocalDateTime.now().getHour();
		
		if(h>=3 && h<=11) 
			greeting="Good Morning";
		else if(h>11 && h<=16) 
			greeting="Good Afternoon";
		else greeting="Good Evening";
			        
		return String.format("%s %s", greeting,name);		

}

}

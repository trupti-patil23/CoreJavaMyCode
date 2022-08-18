package com.cts.demo.service;

import org.springframework.stereotype.Service;

@Service ("greetService")
public class greetServiceImpl implements GreetService {	

	@Override
	public String greet(String name) {
		return name;
	}

}

package com.cts.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope("prototype")   //value will always 1 for all counter objects. new object creates.
@Scope("singleton") //will return same object
public class Counter {

	@Value("${counter.seed:0}")
	private int seed;
	
	public int next() {
		return ++seed;
	}
}

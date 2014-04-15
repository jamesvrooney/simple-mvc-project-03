package com.rooney.james.spring.web.model;

import org.springframework.stereotype.Component;

@Component
public class Person {
	private int id;
	private String name;
	
	public void speak()  {
		System.out.println("My name is James!");
	}
}

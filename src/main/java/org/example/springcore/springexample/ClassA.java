package org.example.springcore.springexample;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassA {
	public String printA() {
		System.out.println("This is class A");
		return "Success";
	}	
}
package org.example.springcore.springexample;

import org.springframework.stereotype.Component;

@Component
public class ClassB implements ClassC {
	public String printC() {
		System.out.println("hii this is class b");
		return "Success";
	}
}

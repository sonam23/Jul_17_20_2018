package com.intuit;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	public void work() {
		try {Thread.sleep(4000);}catch(Exception ex) {};
		System.out.println("working");
	}
	public void browse(String site) {
		System.out.println("Browsing " + site);
	}
}

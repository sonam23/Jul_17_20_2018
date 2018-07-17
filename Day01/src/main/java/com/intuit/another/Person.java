package com.intuit.another;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//"person"
@Component(value="person")
@Lazy
public class Person {
	public Person() {
		System.out.println("Person created");
	}
}

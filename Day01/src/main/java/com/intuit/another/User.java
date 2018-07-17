package com.intuit.another;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new FileSystemXmlApplicationContext("classpath:another.xml");
		
		Cat cat1 = context.getBean("cat",Cat.class);
		System.out.println(cat1.getName());
		
//		Company comp1 = context.getBean("company",Company.class);
//		System.out.println(comp1.getName() + ", " + comp1.getHeadOffice());
//		System.out.println(comp1.getLocations());
		
//		Car car1 = context.getBean("car",Car.class);
//		System.out.println(car1);
//		
//		Car car2 = context.getBean("car",Car.class);
//		System.out.println(car2);
//		
//		Car car3 = context.getBean("car",Car.class);
//		System.out.println(car3);
		
		//Person person1 = context.getBean("person",Person.class);
//		System.out.println(person1);
	}

}

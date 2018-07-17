package com.intuit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");
		PersonsDao  personsDao = context.getBean("personsDao",PersonsDao.class);
		personsDao.insert("Sam", 12);
		System.out.println("Done");
	}

}

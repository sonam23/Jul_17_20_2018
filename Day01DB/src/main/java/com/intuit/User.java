package com.intuit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.dao.DataAccessException;

public class User {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");
		PersonsDao  personsDao = context.getBean("personsDao",PersonsDao.class);
		try {
			personsDao.insert("Sam", 12);
		} catch (DataAccessException e) {
			System.out.println("*****ERROR " + e.getMessage());
		}
		System.out.println("Done");
	}

}

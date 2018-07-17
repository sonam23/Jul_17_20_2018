package com.intuit.lab01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:lab01.xml");
		Conference conf = context.getBean("conference",Conference.class);
		System.out.println(conf.get60MinTopics());
		System.out.println(conf.get50MinTopics());
		System.out.println(conf.get45MinTopics());
	}

}

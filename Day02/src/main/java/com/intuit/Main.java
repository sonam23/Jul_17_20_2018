package com.intuit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");
		AccountService accountService = context.getBean("accountService",AccountService.class);
		accountService.deposit(1, "Salary", 10000);
		accountService.withdraw(1, "Fees", 10);
		System.out.println("Done");
	}

}

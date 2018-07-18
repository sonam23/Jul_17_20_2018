package com.intuit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws MyOwnSillyException{
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");
		AccountService accountService = context.getBean("accountService",AccountService.class);
		//accountService.deposit(1, "Salary", 10000);
		//accountService.withdraw(1, "Fees", 10);
		System.out.println(accountService.getClass().getName());
		System.out.println(accountService.getClass().getSuperclass().getName());
		System.out.println("Done");
	}
	//Try this code removing @Transactional annotation
	//Try this code with @Transactional annotation

}

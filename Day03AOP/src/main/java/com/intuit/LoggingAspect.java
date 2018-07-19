package com.intuit;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	
	
	@Before("execution (* Employee.*(..))")
	public void printTimeBefore(JoinPoint joinPoint) {
		System.out.println("*****BEFORE calling " + joinPoint.getSignature() + " at " + new Date());
	}
	
	@Around("execution (* Employee.browse(..))")
	public void checkBrowsing(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		Object[] args = proceedingJoinPoint.getArgs();
		String site = args[0].toString();
		if("Facebook".equals(site)) {
			System.out.println("Shouldn't you be working?");
		}
		else {
			proceedingJoinPoint.proceed();
		}
	}
	
	
	@After("execution (* Employee.*(..))")
	public void printTimeAfter(JoinPoint joinPoint) {
		System.out.println("*****AFTER calling " + joinPoint.getSignature() + " at " + new Date());
	}
}

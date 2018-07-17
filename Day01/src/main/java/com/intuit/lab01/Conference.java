package com.intuit.lab01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Conference {
	@Autowired
	private SessionPlanner sessionPlanner;
	
	public SessionPlanner getSessionPlanner() {
		return sessionPlanner;
	}
	
	public List<String> get60MinTopics(){
		return sessionPlanner.get60MinTopics();
	}
	public List<String> get50MinTopics(){
		return sessionPlanner.get50MinTopics();
	}
	public List<String> get45MinTopics(){
		return sessionPlanner.get45MinTopics();
	}
}

package com.intuit.lab01withoutannot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class Conference {
	private SessionPlanner sessionPlanner;
	
	
	public void setSessionPlanner(SessionPlanner sessionPlanner) {
		this.sessionPlanner = sessionPlanner;
	}

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

package com.intuit.lab01withoutannot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class SessionPlannerImpl2 implements SessionPlanner{

	private Map<String, String> sessions;
	
	private List<String> _60MinTopics;
	private List<String> _50MinTopics;
	private List<String> _45MinTopics;

	public void constructTopics() {
		_60MinTopics = new ArrayList<String>();
		_50MinTopics = new ArrayList<String>();
		_45MinTopics = new ArrayList<String>();
		sessions.forEach((item,value) -> {
			if(value.contains("60"))
				_60MinTopics.add(item);
			else if(value.contains("50"))
				_50MinTopics.add(item);
			else if(value.contains("45"))
				_45MinTopics.add(item);
		});
	}
	
	
	public List<String> get60MinTopics() {
		return _60MinTopics;
	}
	
	public List<String> get50MinTopics() {
		return _50MinTopics;
	}
	
	public List<String> get45MinTopics() {
		return _45MinTopics;
	}

}

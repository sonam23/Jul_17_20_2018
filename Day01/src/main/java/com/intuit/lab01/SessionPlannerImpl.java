package com.intuit.lab01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SessionPlannerImpl implements SessionPlanner{

	@Resource(name="sessions")
	private Map<String, String> sessions;
	
	private List<String> _60MinTopics;
	private List<String> _50MinTopics;
	private List<String> _45MinTopics;
	
	public List<String> get60MinTopics() {
		if(_60MinTopics == null) {
			_60MinTopics = constructTopics("60");
		}
		return _60MinTopics;
	}
	
	public List<String> get50MinTopics() {
		if(_50MinTopics == null) {
			_50MinTopics = constructTopics("50");
		}
		return _50MinTopics;
	}
	
	public List<String> get45MinTopics() {
		if(_45MinTopics == null) {
			_45MinTopics = constructTopics("45");
		}
		return _45MinTopics;
	}

	private List<String> constructTopics(String duration) {
		List<String> topics = new ArrayList<String>();
		sessions.forEach((item,value) -> {
			if(value.contains(duration))
				topics.add(item);
		});
		return topics;	
	}

	

	


}

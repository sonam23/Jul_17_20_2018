package com.intuit.lab01withoutannot;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public interface SessionPlanner {
	List<String> get60MinTopics();
	List<String> get50MinTopics();
	List<String> get45MinTopics();
}

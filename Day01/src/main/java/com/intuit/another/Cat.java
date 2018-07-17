package com.intuit.another;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat {
	@Value("${catname}")
	private String name;
//	public Cat(@Value("${catname}") String name) {
//		this.name = name;
//	}
	public String getName() {
		return name;
	}
}

package com.intuit;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeansConfiguration {
	
	@Bean(name="calcops")
	public List<String> getCalcOperations(){
		return Arrays.asList("Add","Subtract","Product","Square");
	}
}

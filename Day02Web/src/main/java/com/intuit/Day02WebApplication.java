package com.intuit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages= {""})
public class Day02WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day02WebApplication.class, args);
	}
	
	

	@Bean(name="anothercalcops")
	public List<String> getCalcOperations(){
		return Arrays.asList("Add","Subtract","Product","Square");
	}
}

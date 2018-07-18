package com.intuit;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalcController {
	@Autowired
	private Calculator calculator;
	
	@Autowired
	private List<String> calcops;
	
	@GetMapping
	public List<String> getOperations() {
		return calcops;
	}
	
	@GetMapping("/add/{num1}/{num2}")
	public double add(@PathVariable double num1,@PathVariable double num2) {
		return calculator.add(num1, num2);
	}
	
	@GetMapping("/square/{num}")
	public double square(@PathVariable double num) {
		return calculator.square(num);
	}
	
	@GetMapping("/subtract/{num1}/{num2}")
	public double subtract(@PathVariable double num1,@PathVariable double num2) {
		return calculator.subtract(num1, num2);
	}
	
	@GetMapping("/product")
	public double product(@RequestParam double num1,@RequestParam double num2) {
		return calculator.product(num1, num2);
	}
	
	
}

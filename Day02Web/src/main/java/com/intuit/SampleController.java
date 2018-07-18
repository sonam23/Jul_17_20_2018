package com.intuit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	//http://localhost:8080/bye/Ram
	//http://localhost:8080/bye/Sam
	
	//http://localhost:8080/echo?name=Ram
	//http://localhost:8080/echo?name=Sam
	@PostMapping("/echo")
	@ResponseBody
	public String echo(@RequestParam("name") String name) {
		return name;
	}
	
	@GetMapping("/bye/{name}")
	@ResponseBody
	public String byebye(@PathVariable("name") String name) {
		return "Bye Bye " + name;
	}
	
	@GetMapping("/greet")
	@ResponseBody
	public String greet() {
		return "Hi Good morning";
	}
}

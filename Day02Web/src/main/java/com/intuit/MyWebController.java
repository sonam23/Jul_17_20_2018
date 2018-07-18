package com.intuit;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyWebController {

	@GetMapping("/index")
	public String getIndex() {
		return "myform";
	}
	@PostMapping("/processform")
	public String process(@RequestParam("firstname") String firstName,HttpSession session) {
		String message = "Hi " + firstName; 
		session.setAttribute("message", message);
		return "result";
	}
	
	
}






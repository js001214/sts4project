package com.mysite.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class indexController {

	@GetMapping("/")		
	public String index() {
		
		return "index";	
	}
	
	@GetMapping("/sign_in")		
	public String sign_in() {
		
		return "sign_in";	
	}
	
	@GetMapping("/sign_up")
	public String sign_up() {
		
		return "sign_up";
	}
	
	@GetMapping("/sub1")
	public String sub1(){
		
		return "sub1";
	}
	
	@GetMapping("/sub2")
	public String sub2() {
		
		return "sub2";
	}
	

	
	
}

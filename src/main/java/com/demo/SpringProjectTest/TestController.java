package com.demo.SpringProjectTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/hello")
	public String test() {
		return "This is my first SpringBoot Application for JUnit Testing";
		
	}

}

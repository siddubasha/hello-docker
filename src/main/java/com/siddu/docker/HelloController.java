package com.siddu.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@GetMapping("/")
	public String hello() {
		return "Hello, Welcome to Siddu IT.Good day!!!@@@hahah";
	}
}

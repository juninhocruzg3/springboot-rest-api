package com.juninhocruz.educationalplanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/")
	public String version() {
		return "Educational Planner API v0.0.1";
	}
	
	@PostMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
}

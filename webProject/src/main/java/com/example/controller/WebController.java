package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@GetMapping("/hello")
	public String GetHelloWorld() {
		return "Hello World from Signup controller";
	}

}

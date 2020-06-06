package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MyRestController")
public class MyRestController {
	
	
	@GetMapping("/ping")
	public String ping() {
		System.out.println("Hello");
		return "hello";
	}

}

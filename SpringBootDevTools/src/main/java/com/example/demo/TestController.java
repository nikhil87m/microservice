package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SpringBootDevToolsApplication")
public class TestController {
	
	@GetMapping("/ping")
	public ResponseEntity<String> ping() {
		return  new ResponseEntity<String>();
	}

}

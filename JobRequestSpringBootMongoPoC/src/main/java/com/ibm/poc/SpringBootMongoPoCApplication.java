package com.ibm.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ibm")
public class SpringBootMongoPoCApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoPoCApplication.class, args);
	}

}

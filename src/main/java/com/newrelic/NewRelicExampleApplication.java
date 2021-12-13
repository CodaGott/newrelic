package com.newrelic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class NewRelicExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewRelicExampleApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "Hello";
	}

	@GetMapping("/hi")
	public String hi(){
		return "hi";
	}

}

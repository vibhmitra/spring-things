package com.vibhmitra.springapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringapiApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello World! from hello()";
	}
}

package com.vibhmitra.springapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@SpringBootApplication
@RestController
public class SpringapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringapiApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello World! from hello()";
	}

	@GetMapping("/cars")
	public List<String> cars() {
		return List.of("Honda", "Ford", "Ferrari");
	}

}

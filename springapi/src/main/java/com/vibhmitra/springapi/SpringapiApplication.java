package com.vibhmitra.springapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vibhmitra.springapi.blogpost.BlogPost;

import java.util.*;
import java.time.*;

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

	@GetMapping("/ListOfPosts")
	public List<BlogPost> cars() {
		return List.of(
				new BlogPost(
						1L,
						"First Blog",
						"Momo",
						LocalDate.of(2024, Month.SEPTEMBER, 28),
						1));
	}
}

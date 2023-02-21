package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// @GetMapping
	// public String hello() {
	// return "Hello World";
	// }

	// ctrl+j

	// @GetMapping
	// public static Student student() {
	// LocalDate myObj = LocalDate.now();
	// Student student = new Student((long) 1, "jack", "d", LocalDate.of(2000,7,9),
	// 24);
	// return student;
	// }
	/*
	 * @GetMapping
	 * public static List<Student> student() {
	 * return List.of(new Student("l", "l", LocalDate.of(2009,9,9),24));
	 * }
	 */

}
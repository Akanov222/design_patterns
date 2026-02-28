package com.edu.simple_patterns;

import org.springframework.boot.SpringApplication;

public class TestSimplePatternsApplication {

	public static void main(String[] args) {
		SpringApplication.from(SimplePatternsApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

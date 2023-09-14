package com.prodapt.learningspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AutoConfiguration
public class LearningSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringApplication.class, args);
	}

}
package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebServiceGithubApiApplication {

	public static void main(String[] args) {
		System.out.println("WebService");
		SpringApplication.run(WebServiceGithubApiApplication.class, args);
	}

}

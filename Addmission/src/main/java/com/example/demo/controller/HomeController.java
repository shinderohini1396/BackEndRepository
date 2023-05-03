package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HomeController {

	@PostMapping(value = "/insertdata")
	public String saveData()
	{
		return "Addmission Open";
	}
}

package com.bankapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/bank")
public class BankController {
	@GetMapping(value="/login")
	public String getLogin() {
		return "Hello";
		
	}
	

}

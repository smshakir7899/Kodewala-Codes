package com.flipkart.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController
{
	@GetMapping("/viewForm")
	public String viewLoginPage()
	{
		System.out.println("LoginController.viewLoginPage():::::::::::::::::::");
		return "login-form";
	}
	
	@GetMapping("/logout")
	public String logoutPage()
	{
		System.out.println("LoginController.logoutPage():::::::::::::::::::::");
		
		return "logout-page";
	}
}


package com.kodewala.abstractexp;

public class Driver
{

	public static void main(String[] args)
	{

		LoginService loginService = new LoginService();
		loginService.doLogin("shkr126", "Test@123");
	}

}

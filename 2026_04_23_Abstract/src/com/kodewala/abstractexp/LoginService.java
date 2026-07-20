package com.kodewala.abstractexp;

public class LoginService
{
	public boolean doLogin(String userName, String pwd)
	// connect with database
	// do encryption / decryption
	// business logic to validate user
	{
		connectToDB();
		
		encrypting();
		
		validateUser();
		
		promptPasswordReset();
		
		return true;
	}
	
	
	private void connectToDB()
	{
		System.out.println("LoginService.connectToDB()");
	}
	
	private void encrypting()
	{
		System.out.println("LoginService.encrypting()");
	}
	
	private void validateUser()
	{
		System.out.println("LoginService.validateUser()");
	}
	
	private void promptPasswordReset()
	{
		System.out.println("LoginService.promptPasswordReset()");
	}
}

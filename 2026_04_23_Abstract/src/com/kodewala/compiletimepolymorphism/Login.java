package com.kodewala.compiletimepolymorphism;

public class Login
{

	public boolean doLogin(String name)
	{
		System.out.println("Login.doLogin(String name)");
		return true;
	}
	
	public boolean doLogin(String name, int aadharNo)
	{
		System.out.println("Login.doLogin(String name, int aadharNo)");
		return true;
	}
	
	public boolean doLogin(String mail, int mobNo, String name)
	{
		System.out.println("Login.doLogin(String mail, int mobNo, String name)");
		return true;
	}
}

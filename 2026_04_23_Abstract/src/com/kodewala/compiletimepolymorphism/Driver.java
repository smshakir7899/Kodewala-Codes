package com.kodewala.compiletimepolymorphism;

public class Driver
{

	public static void main(String[] args)
	{
		Login login = new Login();
		login.doLogin("Shakir"); // compile time polymorphism 
		//at the time of compilation compiler will decide which overload method to call 
		
		login.doLogin("sdfs1122@gmail.com", 1234567890, "Sayyed");
	}

}

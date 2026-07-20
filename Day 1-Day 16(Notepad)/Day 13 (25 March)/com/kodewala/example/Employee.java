package com.kodewala.example;

public class Employee
{
	
	protected String employeeName; //Protected variable
	
	public Employee(String name)
	{
		this.employeeName = name;
	}
	
	protected void sayHello()
	{
		System.out.println("Hello, "+employeeName+"!");
	}
}
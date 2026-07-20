package com.kodewala.objects;

class Employee
{
	Employee()
	{
		this(50000);
		
		System.out.println("Default Constructor");
	}
	
	Employee(int salary)
	{
		System.out.println("Salary: "+salary);
	}
}


public class EmployeeDetail
{

	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		

	}

}

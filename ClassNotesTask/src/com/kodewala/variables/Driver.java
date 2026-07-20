package com.kodewala.variables;

class EmployeeDetails
{
	static String companyCode = "Sayyed786";
	String name = "Shakir";
	int age = 26;
	String department = "Mechanical";

}

public class Driver
{

	public static void main(String[] args)
	{
		EmployeeDetails details = new EmployeeDetails();
		System.out.println("Company code: " + EmployeeDetails.companyCode);
		System.out.println("Name: " + details.name);
		System.out.println("Age: " + details.age);
		System.out.println("Department: " + details.department);
	}

}

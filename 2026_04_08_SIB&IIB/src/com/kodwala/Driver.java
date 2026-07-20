package com.kodwala;

class Employee
{
	private String employeeName;
	private String employeeId;
	
	private static int counter =0;
	
	public Employee(String employeeName)
	{
		this.employeeName = employeeName;
		counter++;
		
		this.employeeId = "Kodewala- "+counter;
		
	}
	
	void display()
	{
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee ID: "+employeeId);
	}
}
public class Driver
{

	public static void main(String[] args)
	{
		
		Employee emp = new Employee("Shakir");
		
		
		emp.display();
		
		Employee emp1 = new Employee("Faisal");
		emp1.display();

	}

}

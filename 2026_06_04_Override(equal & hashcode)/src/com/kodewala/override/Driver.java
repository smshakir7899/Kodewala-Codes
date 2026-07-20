package com.kodewala.override;

import java.util.HashSet;
import java.util.Set;

class Employee
{
	String name;

	public Employee(String name)
	{
		super();
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Employee ep = (Employee) obj;
		return this.name.equals(ep.name);
	}
	
	@Override
	public int hashCode()
	{
		return this.name.hashCode();
	}
}
public class Driver
{

	public static void main(String[] args)
	{
		Set<String> StudentList = new HashSet<String>();
		
		StudentList.add("Rahul");
		StudentList.add("Shakir");
		StudentList.add("Rahul");
		StudentList.add("Sakib");
		
		System.out.println(StudentList.size()); // 3
		
		Set<Employee> emp = new HashSet<Employee>();
		
		Employee e1 = new Employee("Shakir");
		Employee e2 = new Employee("Arun");
		Employee e3 = new Employee("Shakir"); 
		Employee e4 = new Employee("Nikhil");
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		System.out.println(emp.size()); // 3
		
		System.out.println(e1.equals(e3));
		System.out.println(e1.hashCode()+" & "+ e3.hashCode());

		
	}

}

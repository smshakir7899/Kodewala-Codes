package com.kodewala.comapreable;

import java.util.TreeSet;

class Employee implements Comparable<Employee>
{
	int salary;
	String name;
	public Employee(int salary, String name)
	{
		super();
		this.salary = salary;
		this.name = name;
	}
	
	
	@Override
	public int compareTo(Employee e2)
	{
		
		int result = Integer.compare(e2.salary, this.salary);
		if (result != 0)
		{
			return result;
		}
		
		return this.name.compareTo(e2.name);
//		int f1 =  (e2.salary - this.salary); // descending order
//		                                     // for ascending order just reverse it(this.salary - e2.salary)
//		int f2 = e2.name.compareTo(this.name);
//		
//		return f1 - f2;
	}
}
public class Driver
{

	public static void main(String[] args)
	{

		Employee e1 = new Employee(100000, "Shakir");
		Employee e2 = new Employee(10000, "Faisal");
		Employee e3 = new Employee(120000, "Nikhil");
		Employee e4 = new Employee(130000, "Nikhil");
		Employee e5 = new Employee(120000, "Sakib");
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		
		for (Employee e : ts)
		{
			System.out.println(e.name + " and " + e.salary);
		}
		
	}

}

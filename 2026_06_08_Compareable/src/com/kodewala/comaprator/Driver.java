package com.kodewala.comaprator;

import java.util.TreeSet;

public class Driver
{

	public static void main(String[] args)
	{

		Employee e1 = new Employee("Sayyed", "Shakir");
		Employee e2 = new Employee("Nikhil", "Kumawat");
		Employee e3 = new Employee("Rijak", "Khan");
		Employee e4 = new Employee("Nikhil", "Pathania");
		Employee e5 = new Employee("Aman", "Khan");
		
		
		
		TreeSet<Employee> ts = new TreeSet<Employee>(new FirstNameComparator());
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		
		for (Employee e : ts)
		{
			System.out.println(e.firstName + " and " + e.lastName);
		}
		
		TreeSet<Employee> tl = new TreeSet<Employee>(new LastNameComparator());
				tl.add(e1);
				tl.add(e2);
				tl.add(e3);
				tl.add(e4);
				tl.add(e5);
				
				System.out.println();
				for (Employee emp : tl)
				{
					System.out.println(emp.firstName + " and " + emp.lastName);
				}
	}

}

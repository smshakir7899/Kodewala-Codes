package com.kodewala.hashmap;

import java.util.HashMap;
import java.util.Map;

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
		Employee emp = (Employee) obj;
		return this.name.equals(emp.name);
	}
	
	@Override
	public int hashCode()
	{
		return this.name.hashCode();
	}
	
}
public class Driver1
{

	public static void main(String[] args)
	{
		
		Map<Employee, String> map = new HashMap<Employee, String>();
		Employee e1 = new Employee("Shakir");
		Employee e2 = new Employee("Kaleem");
		Employee e3 = new Employee("Shakir");
		// HashSet does not store duplicate objects.
		// HashMap does not store duplicate keys.
		Employee e4 = new Employee("Faisal");
		
		map.put(e1, "Last");
		map.put(e2, "First");
		map.put(e3, "Second");
		map.put(e4, "Third");
		
		System.out.println(map.size());
		System.out.println(e1.equals(e3));
		System.out.println(e1.hashCode() + " and " + e3.hashCode());
		
		
	}

}

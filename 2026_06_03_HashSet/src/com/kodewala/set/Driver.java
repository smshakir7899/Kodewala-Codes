 package com.kodewala.set;

import java.util.HashSet;

class Customer
{
	int id;
  
	public Customer(int id)
	{
		super();
		this.id = id;
	}
	
	@Override
	public int hashCode()
	{
		return 123454321;
	}
	
	//HashSet<String> products = new HashSet<String>();
	
	//String a1 = "Sayyed";
}
public class Driver
{

	public static void main(String[] args)
	{
		
		// Contract#1: If two objects are equal then their hash code must be same. 
		String s1 = "Shakir";
		String s2 = "Shakir";
		
		System.out.println(s1.hashCode() +" and "+ s2.hashCode());
		
		Customer c1 = new Customer(1);
		Customer c2 = new Customer(2);
		// Contract#2: If two objects returning same hash code then they may or may not be equal.
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode()+" and "+ c2.hashCode());


	}

}

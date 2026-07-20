package com.kodewala.comapreable;

import java.util.TreeSet;

class Laptop implements Comparable<Laptop>
{
	int ram;
	int price;
	
	public Laptop(int ram, int price)
	{
		super();
		this.ram = ram;
		this.price = price;
	}
	
	@Override
	public int compareTo(Laptop lp)
	{
		if (lp.ram - this.ram != 0)
		{
			return lp.ram - this.ram;
		}
		return this.price - lp.price; // int is data type & string is object 
	}                                 // int....minus sign, String.....(.compareTo)
	
	
}
public class Driver4
{

	public static void main(String[] args)
	{
		Laptop l1 = new Laptop(8, 50000);
		Laptop l2 = new Laptop(8, 70000);
		Laptop l3 = new Laptop(8, 45000);
		Laptop l4 = new Laptop(16, 65000);
		
		TreeSet<Laptop> tl = new TreeSet<Laptop>();
		tl.add(l1);
		tl.add(l2);
		tl.add(l3);
		tl.add(l4);
		
		
		for (Laptop lap : tl)
		{
			System.out.println(lap.ram + " and " + lap.price);
		}
		

	}

}

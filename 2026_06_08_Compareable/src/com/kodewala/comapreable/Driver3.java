package com.kodewala.comapreable;

import java.util.TreeSet;

class Mobile implements Comparable<Mobile>

{
	int price;
	String brand;
	public Mobile(int price, String brand)
	{
		super();
		this.price = price;
		this.brand = brand;
	} 
	
	@Override
	public int compareTo(Mobile m)
	{
		System.out.println(this.brand + " compared with " + m.brand);
		
		if (this.price - m.price != 0)
		{
			return this.price - m.price;
		}
		
		return this.brand.compareTo(m.brand);
	}
}
public class Driver3
{

	public static void main(String[] args)
	{

		Mobile m1 = new Mobile(20000, "Samsung");
		Mobile m2 = new Mobile(15000, "RealMe");
		Mobile m3 = new Mobile(80000, "Apple");
		Mobile m4 = new Mobile(20000, "Vivo");
		
		TreeSet<Mobile> ts = new TreeSet<Mobile>();
		 ts.add(m1);
		 ts.add(m2);
		 ts.add(m3);
		 ts.add(m4);
 
		 System.out.println();
		 for (Mobile mob : ts)
		{
			System.out.println(mob.brand + " and " + mob.price);
		}
	}

}

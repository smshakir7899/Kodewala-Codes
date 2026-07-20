package com.kodewala.objects;

class Mobile
{
	Mobile()
	{
		System.out.println("Default Constructor");
	}
	
	Mobile(String brand)
	{
		System.out.println("Brand: "+brand);
	}
}

public class MobileDetail
{

	public static void main(String[] args)
	{
		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile("Nothing");

	}

}

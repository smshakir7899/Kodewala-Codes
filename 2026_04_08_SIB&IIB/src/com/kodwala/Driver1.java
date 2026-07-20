package com.kodwala;

public class Driver1 
{
	public static void main(String[] args) 
	{
		Driver1 d = new Driver1();
		d.m1();
	}
	
	public void m1() 
	{
		m2();
		System.out.println("Driver.m1()");
	}
	
	public void m2() 
	{
		m3();
		System.out.println("Driver.m2()");
	}
	
	public void m3() 
	{
		System.out.println("Driver.m3()");
	}
	

}
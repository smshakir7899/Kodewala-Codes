package com.kodewala.method.override;


class Father // Parent class

// Functionalities(inside parent class)
{
	void saySomething()
	{
		System.out.println("I Like Mutton");
	}
}

class Son extends Father // son is child class
{
	
	// for Override you have to use exactly same method name
	@Override
	void saySomething()
	{
		System.out.println("I Hate Mutton"); // here i override fathr's method and change it
	}
	
	
}
public class Driver
{

	public static void main(String[] args)
	{
		Son s1 = new Son();
		s1.saySomething();
	}

}

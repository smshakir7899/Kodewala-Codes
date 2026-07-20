package com.kodewala.inf.types;

public class Clonable_Marker implements Cloneable
{

	String name;

	public Clonable_Marker(String name)
	{
		super();
		this.name = name;
	}

	@Override
	public Clonable_Marker clone() throws CloneNotSupportedException
	{
		return (Clonable_Marker) super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Clonable_Marker c = new Clonable_Marker("Shakir");
		Clonable_Marker c1 = c.clone(); // clone means copying an object
		// but here it throws CloneNotSupportedException as first you have to
		// implement Clonnable interface

		// after implementing you will see that your object is coppied and you will be
		// able to see output

		System.out.println("C: " + c.name);
		System.out.println("C1: " + c1.name);

		// next question is as when you go to Object class you see clonnable interface
		// is empty...why?

		if (c instanceof Cloneable) // True if class's object is type of Clonnable person class should implelement
									// clonable interface
		{
			System.out.println("c is a type of Clonnable");
		} else
		{
			System.out.println("c is not a type of Clonnable. You can not clone the object of Clonable_Marker class ");
		}

	}

} //

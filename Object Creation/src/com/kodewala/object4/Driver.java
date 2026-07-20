package com.kodewala.object4;


class Machine
{
	Machine()
	{
		super();
		System.out.println("Machine Started");
	}
	
}


class CNCMachine extends Machine
{
	
	CNCMachine()
	{
		this(500);
		System.out.println("Default CNC Machine");
	}
	
	CNCMachine(int power)
	{
		super();
		System.out.println("Power: "+ power);
	}

}
public class Driver
{

	public static void main(String[] args)
	{
		CNCMachine c1 = new CNCMachine();
	}

}

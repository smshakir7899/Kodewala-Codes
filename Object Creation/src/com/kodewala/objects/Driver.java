package com.kodewala.objects;


class Payment
{
	String name;
	int amount;
	
	Payment(String n, int a)
	{
		name = n;
		amount = a;
	}
	
	void display()
	{
		System.out.println(name);
		System.out.println(amount);
	}
}

public class Driver
{

	public static void main(String[] args)
	{
	
		Payment p1 = new Payment("Shakir", 5000);
		
		p1.display();
	}

}



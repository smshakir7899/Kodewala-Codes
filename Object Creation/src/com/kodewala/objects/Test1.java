package com.kodewala.objects;

public class Test1
{

	public static void main(String[] args)
	{
		
		Book1 b1 = new Book1("Sayyed", 786);
		b1.display();

	}

}

class Book1
{
	String title;
	int price;
	
	Book1 (String title, int price)
	{
		this.price = price;
		this.title = title;
	}
	
	void display()
	{
		
		System.out.println(title);
		System.out.println(price);
		
	}
}

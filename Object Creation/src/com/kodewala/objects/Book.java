package com.kodewala.objects;

public class Book
{

	public static void main(String[] args)
	{
		Test t1 = new Test("Java", 500);
		t1.display();

	}

}

class Test
{
	String title;
	int price;
	
	Test(String title, int price)
	{
		this.title = title;
		this.price = price;
	}
	
	void display()
	{
		
		System.out.println(title);
		System.out.println(price);
	}
}

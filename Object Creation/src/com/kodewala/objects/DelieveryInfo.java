package com.kodewala.objects;

class Delievery1
{
	String customerName;
	String itemName;
	String delDate;
	String status;
	
	Delievery1()//Default Constructor
	{
		
	System.out.println("Default Values");
	System.out.println(customerName);
	System.out.println(itemName);
	System.out.println(delDate);
	System.out.println(status);
	
	System.out.println();
	
	}
	
	Delievery1(String cust, String item, String del, String stat)
	{
		customerName = cust;
		itemName = item;
		delDate = del;
		status = stat;
		
	}
	
	void display()
	{
		System.out.println("Customer Name: "+customerName);
		System.out.println("Item Name: "+itemName);
		System.out.println("Delievery Date: "+delDate);
		System.out.println("Status: "+status);
	}
}


public class DelieveryInfo
{

	public static void main(String[] args)
	{
		Delievery1 user = new Delievery1();
		
		
		Delievery1 user1 = new Delievery1("Shakir","Laptop","24 May ","Unsuccesful"); 
		Delievery1 user2 = new Delievery1("Faisal","Bike","31 May ","Unsuccesful"); 
		Delievery1 user3 = new Delievery1("Zahur","Mac","24 July ","Succesful"); 
		
		
		user1.display();
		System.out.println();
		user2.display();
		System.out.println();
		user3.display();
		
	}

}

package com.kodewala.objects;

public class Delievery
{
	
	String customerName;
	String itemName;
	String delDate;
	String status;
	
	
}


class DelieveryPrint
{
	public static void main(String a[])
	{
		
		Delievery del = new Delievery();
		System.out.println(del.customerName);
		System.out.println(del.itemName);
		System.out.println(del.delDate);
		System.out.println(del.status);
		
	}

}
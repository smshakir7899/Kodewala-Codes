package com.kodewala.object1;

class ConstructorOver
{
	int amount;
	String upiID;
	String note;
	String bank;
	String mobileNumber;
	String name;
	
	public ConstructorOver(int amount, String upiID)
	{
		this.amount = amount;
		this.upiID = upiID;
	}
	
	
	public ConstructorOver(int amount, String upiID, String note )
	{
		this.amount = amount;
		this.upiID = upiID;
		this.note = note;
	}
	
	public ConstructorOver(int amount, String upiID, String name, String mobileNumber )
	{
		this.amount = amount;
		this.upiID = upiID;
		this.mobileNumber = mobileNumber;
	}
	
	public ConstructorOver(int amount, String upiID, String name, String mobileNumber, String bank )
	{
		this.amount = amount;
		this.upiID = upiID;
		this.mobileNumber = mobileNumber;
		this.bank = bank;
	}
}



public class Driver
{

	public static void main(String[] args)
	{
		
		ConstructorOver pay1 = new ConstructorOver(786, "Shakir@1223");
		System.out.println(pay1.amount);
		ConstructorOver pay2 = new ConstructorOver(786, "Shakir@1223", "Flower");
		ConstructorOver pay3 = new ConstructorOver(786, "Shakir@1223", "Shakir","+91 7053434234");
		System.out.println();


	}

}

package com.kodewala;

class ElectronicItem
{
	void getDetails()
	{
		String[] items = new String[5];
		items[0]= "Laptop";
		items[1]= "Mouse";
		items[2]= "Mobile Phone";
		items[3]= "Headphones";
		items[4]= "Power Bank";
		
		for (int i = 0; i < items.length; i++)
		{
			System.out.println("Item Number "+(i+1)+": "+items[i]);
		}
		
		System.out.println();
		
		for (int i = items.length-1; i >= 0; i--)
		{
			System.out.println("Item Number "+(i+1)+": "+items[i]);
		}
	}
}
public class Driver1
{

	public static void main(String[] args)
	{
		ElectronicItem itm = new ElectronicItem();
		itm.getDetails();
				
	}

}

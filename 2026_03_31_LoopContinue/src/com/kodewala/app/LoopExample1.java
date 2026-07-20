package com.kodewala.app;

public class LoopExample1 
{

	public static void main(String[] args) 
	{
		System.out.println("Main...STARTED");
		LoopExample1 exp=new LoopExample1();
		exp.checkCity();
		System.out.println("Main...ENDED");
		

	}

	public void checkCity() 
	{
		String cities[]= {"Banglore","Delhi","Hydrabad","Lucknow","Chennai"};
		
		for(int i=0; i<cities.length; i++)
		{
			if(cities[i]==("Banglore"))
			{
				System.out.println("Yes.. Banglore is in the list");
				break;//Loop completely stops.
			}
		}
		
		
	}
}

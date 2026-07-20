package com.kodewala.app;

public class LoopExample {

	public static void main(String[] args) {
		String cities[]= {"Banglore","Delhi","Hydrabad","Lucknow","Chennai"};
		//Task--> Find wheather Banglore are available in the given array or not
		
		for(int i=0; i<cities.length; i++)
		{
			if(cities[i]==("Banglore"))
			{
				System.out.println("Yes.. Banglore is prsent in the list.");
				break;//Loop completely stops.
			}
		}
	}

}

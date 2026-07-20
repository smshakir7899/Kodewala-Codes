package com.kodewala;

public class ElectronicItems
{

	public static void main(String[] args)
	{
		//Crating an array of electronic items along with their prices
		String[] products = {"Laptop","Smartphones","Tablet","Smartwatch","Earpods"};
		int[] prices = {50000, 30000, 20000, 15000, 5000};
		
		//Variables to store the index of highest price
		int maxPriceIndex = 0;
		
		//Iterate through the array to find the highest price
		for (int i = 0; i < prices.length; i++)
		{
			if (prices[i]>prices[maxPriceIndex])
			{
				maxPriceIndex = i;
			}
		}
		
		//Printing the product with highest price
		System.out.println("Theb product with the highest price is: "+products[maxPriceIndex]+" with a price of Rs."+prices[maxPriceIndex]);
	}

}

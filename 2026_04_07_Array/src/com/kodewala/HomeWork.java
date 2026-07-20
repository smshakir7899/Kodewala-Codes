package com.kodewala;

public class HomeWork
{

	public static void main(String[] args)
	{
		
		//String[] bookTitles = {"Engineering Mechanics","Theory of Machines","Strength of Material","Fluid Mechanics","Heat Transfer"};
		//int[] prices = {240, 560, 546, 787, 679};
		
		String[] bookTitles =new String[5];
		int[] prices =new int[5];
		
		bookTitles[0] = "Engineering Mechanics";
		bookTitles[1] = "Theory of Machines";
		bookTitles[2] = "Strength of Material";
		bookTitles[3] = "Fluid Mechanics";
		bookTitles[4] = "Heat Transfer";
		
		prices[0] = 240;
		prices[1] = 560;
		prices[2] = 546;
		prices[3] = 787;
		prices[4] = 679;
		
		for (int i = 0; i < prices.length; i++)
		{
			System.out.println("Book Title : " + bookTitles[i]);
			System.out.println("Price : " + prices[i]);
			System.out.println();
		}
	}

}

package com.kodewala.interfce;

public class Driver
{

	public static void main(String[] args)
	{
		 Banking hdfc = new HDFC();
	        Banking rural = new RuralBanking();

	        hdfc.printPassBook();   // default method
	        rural.printPassBook(); // Overridden method
	}

}

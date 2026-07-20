package com.kodewala.interfce;

public class RuralBanking implements Banking
{

	@Override
	public void Pay()
	{
		System.out.println("RuralBanking.Pay()");
	}

	@Override
	public void settle()
	{
		System.out.println("RuralBanking.settle()");
	}

	@Override
	public void cancelTxn()
	{
		System.out.println("RuralBanking.cancelTxn()");
	}
	
	@Override
	public void printPassBook()
	{
		System.out.println("RuralBanking.printPassBook()");
	}

}

package com.kodewala.thread.practice;

class EvenThread extends Thread
{

	@Override
	public void run()
	{

		for (int i = 1; i <= 10; i++)
		{
			if (i % 2 == 0)
			{
				System.out.println("Even : " + i + " -> " + Thread.currentThread().getName());
			}
		}
	}
}

class OddThread extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i <= 10; i++)
		{
			if (i % 2 != 0)
			{
				System.out.println("Odd : " + i + " -> " + Thread.currentThread().getName());
			}
		}
	}
}

public class Driver
{

	public static void main(String[] args)
	{
		EvenThread even = new EvenThread();
		even.setName("Even-Thread");
		 
		
		OddThread odd = new OddThread();
		odd.setName("Odd-Thread");
		even.start();
		odd.start();
	}

}

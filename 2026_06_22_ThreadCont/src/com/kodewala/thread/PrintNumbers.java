package com.kodewala.thread;


public class PrintNumbers extends Thread
{
	@Override
	public void run() // running  
	{
		System.out.println("PrintNumbers.run()...");
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Number: " + i);
			
			if (i == 5)
			{
				System.out.println("Sending " + Thread.currentThread().getName() + " to sleep/waiting state");
				try
				{
					Thread.currentThread().sleep(5000);
				} catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("sleep time over, starting execution again...");
			}
		}
	}

	public static void main(String[] args)
	{
		PrintNumbers numbers = new PrintNumbers(); // new born
		numbers.setName("T1");
		numbers.start(); // runnable
	}

}

 
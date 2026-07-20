package com.kodewala.thread;

class EvenThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("EvenThread.run()");
		for (int i = 1; i <= 20; i++)
		{
			if (i %2 == 0)
			{
				System.out.println("Even Number: " + i);
				
				if (i == 10)
				{
					System.out.println("Sending " + Thread.currentThread().getName() + "  to sleep/waiting state");
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
	}
}

class OddThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("EvenThread.run()");
		for (int i = 1; i <= 20; i++)
		{
			if (i %2 != 0)
			{
				System.out.println("Odd Number: " + i);
				
				if (i == 9)
				{
					System.out.println("Sending " + Thread.currentThread().getName() + "  to sleep/waiting state");
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
	}
}
public class ClassTask
{

	public static void main(String[] args)
	{
		EvenThread evenThread = new EvenThread();
		evenThread.setName("Even");
		evenThread.start();
		
		OddThread oddThread = new OddThread();
		oddThread.setName("Odd");
		oddThread.start();
	}

}

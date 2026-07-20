package com.kodewala.thread;

public class PrintNumbers1 implements Runnable
{

	@Override
	public void run()
	{
		System.out.println("PrintNumbers1.run()...");

		for (int i = 0; i < 10; i++)
		{
			System.out.println("Number: " + i + " and printed by " + Thread.currentThread().getName());

			if (i == 4)
			{
				System.out.println("Sending " + Thread.currentThread().getName() + "  to sleep/waiting state");
				try
				{
					Thread.currentThread().sleep(3000);
				} catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("sleep time over... start again...  " + Thread.currentThread().getName());
			}
		}
	}

	public static void main(String[] args)
	{
		PrintNumbers1 numbers1 = new PrintNumbers1();
		Thread t1 = new Thread(numbers1);
		t1.run(); // here we are running the thread instead of starting..
		// this will not start or create the new thread all the method will be run by
		// Main thread only.

	}

}

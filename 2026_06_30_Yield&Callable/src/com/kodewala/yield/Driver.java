package com.kodewala.yield;

class FirstThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " FirstThread.run()...START");
		Thread.yield(); // pause the current thread and give chance to other thread
		System.out.println(Thread.currentThread().getName() + " FirstThread.run().....END");
	}
	/*
	 * limitation of run method.. 1) it does not return anything.. 
	 * for e.g.
	 * Suppose you are sending an email, after sending the email,
	 * how will the main thread know? 
	 * that Email sent successfully? Failed? Server unavailable? 
	   
	 * 2) it does not throw an exception
	 */
}

public class Driver
{

	public static void main(String[] args)
	{
		FirstThread t1 = new FirstThread();
		t1.start();

		FirstThread t2 = new FirstThread();
		t2.start();
	}

}

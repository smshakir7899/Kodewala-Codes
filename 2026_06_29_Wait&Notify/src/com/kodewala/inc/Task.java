package com.kodewala.inc;

public class Task
{
	int number;
	boolean isDataAvailable = false;

	public synchronized void producer(int num) throws InterruptedException
	{
		while (isDataAvailable)
		{
			System.out.println(Thread.currentThread().getName() + " is waiting..");
			wait();
		}

		number = num;
		System.out.println("Producing data: " + number);
		isDataAvailable = true;
		notify();

	}

	public synchronized void consumer() throws InterruptedException
	{
		while (!isDataAvailable)
		{
			System.out.println(Thread.currentThread().getName() + " is waiting....");
			wait();
		}

		// number = num;
		System.out.println("Consuming it: " + number);
		isDataAvailable = false;
		notify();

	}
}

package com.kodewala.thread;

class MyThread1 extends Thread
{
	@Override
	public void run()
	{
		// this process is called context switching
		for (int i = 0; i <= 10; i++) // this is actual task
		{
			System.out.println("MyThread.run(): "+ i + " " + Thread.currentThread().getName());
			try
			{
				Thread.sleep(500); // 500 milliseconds = 0.5 seconds
			} catch (InterruptedException e)
			{
				e.printStackTrace();
 			} 
		}
	}
}

public class Driver
{

	public static void main(String[] args)
	{

		System.out.println("Driver.main()...." + Thread.currentThread().getName());
		MyThread1 t1 = new MyThread1();
		t1.setName("T1");
		t1.start();
		
		MyThread1 t2 = new MyThread1();
		t2.setName("T2");
		t2.start();
		
	}
	
}

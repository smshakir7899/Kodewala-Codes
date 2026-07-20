package com.kodewala.thread;

public class Runnablee implements Runnable
{
	
	@Override
	public void run() // RUNNING STATE
	{
		System.out.println("Runnablee.run().......attending kodewala class.....STARTED at 9 AM");
		System.out.println("Runnablee.run()");
		System.out.println("Runnablee.run()");
		System.out.println("Runnablee.run()"); 
		// T1(for e.g. STUDNT) can go to sleep/wait/pause state --> WAITING STATE  
		// Once waiting is over T1 again move to runnable CPU gives time to T1 --> RUNNING STATE
		System.out.println("Runnablee.run()");
		System.out.println("Runnablee.run()");
		System.out.println("Runnablee.run().......attending kodewala class.....END at 9 AM");
	} // Once run method is completed, T1 ----> terminated / DEAD STATE  

	public static void main(String[] args)
	{
		Runnablee runnablee = new Runnablee();
		Thread t1 = new Thread(runnablee); // new born (thread object created (using runnable interface))
		
		t1.setName("T1");
		t1.start(); // Thread moved from new born to RUNNABLe 
		// t1.start(); --> now as T1 is dead/terminated if you again try to start it will show "IllegalThreadStateException"
		
	}

}

package com.kodewala.thread;

class MyTask implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Task is executing " + Thread.currentThread().getName());
	}
}
public class Demo
{

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Demo.main()..START" + Thread.currentThread().getName());
		Thread t1 = new Thread(new MyTask());// till here no thread is created untill .start not executed 
		// even if you do t1.run.... Still no thread is created only main will act as a thread  
		t1.start(); // this starts and create a new thread
		t1.setName("T1");
		Thread.sleep(4000); // This sleeps/pause the thread for 4 seconds...you can see while running
		System.out.println("Demo.main()...END" + Thread.currentThread().getName());
	}

}

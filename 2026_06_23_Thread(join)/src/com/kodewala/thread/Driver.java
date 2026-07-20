package com.kodewala.thread;

/*Sleep() pauses a thread without releasing the lock.   
->The Thread goes to sleep temporarily.
->It does not release the lock/monitor.
e.g. I am sleeping inside a room and the key is still with me...so people outside must wait until I wake up.

   
wait() pauses a thread and release the lock until notified.
-> The enters the waiting state. 
-> It releases the lock/monitor.
e.g. I am waiting/sleeping inside a room & leave the key outside like in shoe or somewhere so people outside can take the key and enter the room. */

class Printing extends Thread
{

	public void run()
	{
		System.out.println("Printer started printing [" + getName() + "]");
		try
		{
			sleep(5000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Printing completed [" + getName() + "]");
	}
}

public class Driver
{

	public static void main(String[] args) throws InterruptedException
	{
		Thread.currentThread().setName("Student");
		System.out.println("Student created document [" + Thread.currentThread().getName() + "]"); 
		Printing t1 = new Printing();
		Printing t2 = new Printing();
		t1.setName("Printer");
		t1.start(); // printing started 
		t1.join(); // student thread will wait here till printing is completed 
		System.out.println("Student submitted assignment [" + Thread.currentThread().getName() + "]");
	}

}

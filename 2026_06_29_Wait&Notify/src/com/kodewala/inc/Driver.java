package com.kodewala.inc;

public class Driver
{
	public static void main(String[] args)
	{
		Task task  = new Task();
		
		 Producer p1 = new Producer(task);
		 p1.setName("Producer");
		 p1.start(); 
		 
		 Consumer c1 = new Consumer(task);
		 c1.setName("Consumer");
		 c1.start();
	}
}

package com.kodewala.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class EmailSender implements Callable<Boolean> // whatever type(e.g. Integer, Boolean) you write here will return the
												// same

// if you use callable method means you want to return something 
{

	@Override
	public Boolean call()
	{
		System.out.println(Thread.currentThread().getName());
		return true;
	}
}

public class Driver
{

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		ExecutorService service = Executors.newFixedThreadPool(2);
		EmailSender task = new EmailSender();
		Future<Boolean> future = service.submit(task);
		System.out.println("response from call() methtod: " + future.get());
		service.shutdown();
	}

}

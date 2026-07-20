package com.kodewala.cf.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class RunTask implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Task executed by " + Thread.currentThread().getName());
		try
		{
			Thread.sleep(2000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

public class Task1
{

	public static void main(String[] args) throws InterruptedException
	{

		ExecutorService service = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 5; i++)
		{
			RunTask task = new RunTask();
			service.execute(task);
			Thread.sleep(2000);

		}

		service.shutdown();

	}

}

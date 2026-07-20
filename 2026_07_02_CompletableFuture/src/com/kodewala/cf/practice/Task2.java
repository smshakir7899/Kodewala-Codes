package com.kodewala.cf.practice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallTask implements Callable<Integer>
{
	@Override
	public Integer call()
	{
		int sum = 0;
		for (int i = 1; i <= 100; i++)
		{
			sum = sum + i;
		}
		return sum;
	}
}

public class Task2
{

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		ExecutorService service = Executors.newSingleThreadExecutor();
		CallTask task = new CallTask();
		Future<Integer> future = service.submit(task);
		System.out.println("Total: " + future.get());

		service.shutdown();
	}

}

package com.kodewala.executorframe;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//class NotifyDelivery implements Runnable


/* Before Executor Framework, we used to create a new Thread object for every task.
 * Creating threads repeatedly is expensive because thread creation takes time and memory.
 * Manual way of creating memory also we can not track progress of the task. 
 *
 * Executor Framework (introduced in Java 5) reuses existing threads instead of creating
 * a new thread for every task. This improves performance.
 *
 * Since ExecutorService manages threads internally, we should call shutdown()
 * after submitting all tasks so that the thread pool can terminate properly.
 *
 * Executors class provides different types of thread pools. 
 * Thread Pool = A collection(or a container) of reusable worker threads.
 *
 * Common thread pools(learn only 3-4):
 * 1. Executors.newSingleThreadExecutor()  -> Creates only one worker thread.
 * 2. Executors.newFixedThreadPool(n)      -> Creates a fixed number of worker threads.
 * 3. Executors.newCachedThreadPool()      -> Creates threads as needed and reuses idle threads.
 */

class NotifyDelivery implements Callable<String>
{
//	@Override
//	public void run()
//	{
//		System.out.println("NotifyDelivery.run()" + Thread.currentThread().getName());
//		DelieveryService delieveryService = new DelieveryService();
//		delieveryService.confirmDelivery();
//	}

	@Override
	public String call() throws InterruptedException
	{
		System.out.println("NotifyDelivery.call()" + Thread.currentThread().getName());
		DelieveryService delieveryService = new DelieveryService();
		delieveryService.confirmDelivery();
		Thread.sleep(3000);
		return "Success";
	}
}

public class Driver
{
	// java 1.5
	// threads can reuse

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
//		ExecutorService service = Executors.newSingleThreadExecutor(); // only single thread will be created

//		ExecutorService service = Executors.newCachedThreadPool(); // thread will be decided by ex framework
		// if you do 500 task that does not mean 500 thread will be created(approx 170 180
		// will create) and do 500 task.

		ExecutorService service = Executors.newFixedThreadPool(10); // fixed number of thread will create by ex
																	// framework

		for (int i = 0; i < 100; i++)
		{
			NotifyDelivery task = new NotifyDelivery();
			// service.execute(task); // execute accepts only runnable.
			// where as submit accepts both Runnable and Callable() it always return a future object.
			// but if you get future of submit in Runnable you get null(as it is a void
			// type)

			Future<String> response = service.submit(task);
			System.out.println(" waiting for response");
			System.out.println(response.get()); 
			// Future.get() blocks the calling thread until the task finishes.
			// This blocking behavior is one of the reasons CompletableFuture
			// (introduced in Java 8) became popular, as it supports asynchronous,
			// non-blocking task composition(i.e. multiple task can be executed parallely). 
			// for e.g previously if you have 3 tasks i.e. T1(400ms), T2(500ms), T3(1000ms) --> Time(1900) it will add all time as there is blocking behavior
			
			System.out.println(" got response");

		}

		service.shutdown();
	}

}

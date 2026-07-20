package com.kodewala.cf;

import java.util.concurrent.CompletableFuture;

/* CompletableFuture was introduced in Java 8.
*
* Why?
* --------
* Future.get() blocks the calling thread until the task is completed.
* During that time the calling thread cannot perform any other work.
*
* CompletableFuture provides a non-blocking way to execute asynchronous
* tasks(asynchronous means non blocking means if one task is started then calling thread does not wait for its completion). 
* It also supports task chaining, callback, combining multiple
* tasks, and exception handling.
*/

 
public class Driver
{

	public static void main(String[] args)
	{
		System.out.println("Driver.main() START");
		CompletableFuture.runAsync(() -> {
			System.out.println("This is from run Async");
		});

		System.out.println("Driver.main() END");
		
		/* runAsync()
		* ----------
		* Used when the task does NOT return any result (similar to Runnable).
		* It executes the task asynchronously using a thread from the common
		* ForkJoinPool (unless a custom Executor is provided).
		*/
		
		
		/*
		 * supplyAsync() ------------- Used when the task returns a result. Similar to
		 * Callable because it performs some work and returns a value.
		 *
		 * It also executes the task asynchronously using a thread from the common
		 * ForkJoinPool (unless a custom Executor is provided).
		 */
	}

}

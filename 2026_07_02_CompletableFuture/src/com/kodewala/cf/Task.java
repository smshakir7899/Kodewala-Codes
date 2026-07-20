package com.kodewala.cf;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Task
{
	// Task: write and program to return string in upper case.

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
			String name = "Kodewala";
			return name;
		}).thenApply(n -> n.toUpperCase());
		// 2 ways to convert it into upper case: 1 is to create another thread and other
		// is to use thenApply
		// thenApply does not modify the existing one instead it creates a new value
		// and returns a new CompletableFuture

		System.out.println(cf.get());
		System.out.println();

		CompletableFuture cf1 = CompletableFuture.supplyAsync(() -> {
			String name = "Shakir";
			return name;

		}).thenAccept(name -> System.out.println("Hello " + name));
		// thenAccept() consumes the result but does not return a new value
		// (as thenApply return a new value).

		System.out.println(" response : " + cf1.join());
		System.out.println();

		/*
		 * join() waits for the asynchronous task to complete. Since thenAccept()
		 * returns CompletableFuture<Void>(i.e. it does not return anything), join()
		 * returns null after completion.
		 */

		CompletableFuture cf3 = CompletableFuture.supplyAsync(() -> {
			String name = "Sayyed";
			return name;
		}).thenRun(() -> System.out.println("Done"));
		
		System.out.println(cf3.get());
	}

}

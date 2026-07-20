package com.kodewala.cf.practice;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Task3
{

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(() -> {
			String name = "Shakir";
			return name;
		}).thenApply(n -> n.toUpperCase()).thenAccept(name -> System.out.println("HELLO " + name));

		completableFuture.join();

	}

}

package com.kodewala.cf;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Driver1
{

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
			System.out.println("I am from supply async");
			return "Success";
		});

		System.out.println("CompletableFuture's response from supply async: " + completableFuture.get());
	}

}

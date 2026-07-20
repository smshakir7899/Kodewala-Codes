package com.kodewala.cf;

import java.util.concurrent.CompletableFuture;

public class ThenCombine
{

	public static void main(String[] args)
	{
		CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 10);
		CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 60);

		CompletableFuture<Integer> finalFuture = future1.thenCombineAsync(future2, (n1, n2) -> n1 + n2);
		System.out.println(finalFuture.join());
		
		/*  
		 * thenCombine() -> Waits for two CompletableFutures(asynchronous task), 
		 * 					combines their results,
		 *                  and returns a new CompletableFuture.
		 *
		 * allOf()       -> Waits until ALL the given CompletableFutures complete.
		 *                  Returns CompletableFuture<Void>.
		 *
		 * anyOf()       -> Completes as soon as ANY ONE CompletableFuture completes.
		 *                  Returns the result of the first completed task as an Object.
		 */
	}

}

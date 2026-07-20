package com.kodewala.inf;

public interface FunctionalInf // Functional interface can allow ONLY ONe ABSTRACT m
{
	 //@FunctionalInterface
	// this introduce to achieve lambda 
	public abstract String doSomething();

	public default void doNothing()
	{
		 

	}
}

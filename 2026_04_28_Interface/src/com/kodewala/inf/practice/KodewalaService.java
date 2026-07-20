package com.kodewala.inf.practice;

public interface KodewalaService
{
	public static final String COMPANY_NAME = "Kodewala Academy";
	// All variables in an interface are public,static and final by default.
	// final-> value can not changed
	
	public static final int MAX_STUDENTS = 1000;
	
	public abstract void provideService(); // --> WHAT(HOW part is done by child classes)
	// this should be implemented by classes which implements the interface.
}

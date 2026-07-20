package com.kodewala.interfce;

//2010(1.6) --> 2012(wanted new feature "printPassBook")
interface Banking
{
	void Pay(); // 2010

	void settle(); // 2010

	void cancelTxn(); // 2010

	// before java 1.8 if you want to introduce new method then as interface is
	// 100% abstract then that method should implement by all the child classes and
	// some of classes that does not required it has to be run an empty method to
	// run their program.

	// for e.g. if i want a new method i.e. passBookPrint but only in rural banking
	// class so it should implement by all other banks although empty but it should
	// (ALL THIS THING IS BEFORE JAVA 8)

	// In java 8 they introduce new feature i.e. default so if you give new method
	// as default then only needed class can implement rest can run without
	// implementing

	// Q. Why default methods were introduced in Java 8?
	// Answer:To provide "backward compatibility". New methods can be added to
	// interfaces without forcing all existing implementing classes to modify their code.
	
	default void printPassBook() // only want in Rural Banking
	{
		System.out.println("Banking.printPassBook() -- default functionality");
	}

}
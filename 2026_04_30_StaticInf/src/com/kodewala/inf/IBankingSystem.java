package com.kodewala.inf;

public interface IBankingSystem
{
	void deposit();

	void withdraw();

	void accOpening();

	void eKYC();

	// static method --> so all the classes can directly use it without overriding
	public static void balanceCheck()
	{
		System.out.println("BankingSystem.balanceCheck()");
	}

	static void printInvoicePDF() // Common functionality
	{
		// 200 lines of code(connect to server(50) -- > init print -- > write to file --
		// > send to customer(25))
		connectToServer();
		sendEmail();
	}

	public static void sendNotification()
	{
		// 200 lines of code(connect to server(50) --> write to file -- > send to
		// customer(25))

		connectToServer(); // Now no need of --> 200 lines of code(connect to server(50)
		sendEmail(); // no need of --> send to customer(25))
	}

	// static also comes with code duplicacy as you see above just to connecting
	// server we have to use same lines of code in both the methods

	// so in java 9 they introduced private method as well

	private static void connectToServer() // private method can be static as well as non static...but non static can
											// only accessible in default method only
	{
		System.out.println("IBankingSystem.connectToServer()");
	}

	private static void sendEmail()
	{
		System.out.println("IBankingSystem.sendEmail()");
	}
}

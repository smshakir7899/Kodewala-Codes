package com.kodwala;

public class Payment
{
	{
		System.out.println("Inside IIB"); //For initializing IIB only put two curly braces
	} // IIB executes every time for every object separately 
	
	public Payment()
	{
		//first line ----> either super() or this()
		//second line ---> call to initial block i.e. IIB
		this(34);
		System.out.println("inside Payment constructor");
	}
	
	public Payment(int amt)
	{
		System.out.println("Payment.Payment(amt)");
	}

	public static void main(String[] args)
	{
		
		System.out.println("Payment.main()");
		
		Payment p1 = new Payment();
		Payment p2 = new Payment(101);
	}
	
	static //for static OR SIB you need 2 curly braces with static at start
	{
		System.out.println("Inside SIB....only once");//SIB executed only once per class
	}

}
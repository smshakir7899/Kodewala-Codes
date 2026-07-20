package com.kodewala.inheritance.Payment;

public class Driver 
{

	public static void main(String[] args)
	{
		PhonePay p1 = new PhonePay(1122);
		p1.makePayment();
		
		GPay p2 = new GPay(9875);
		p2.makePayment();
		
		CreditCard p3 = new CreditCard(100000);
		p3.makePayment();
		
		NetBanking p4 = new NetBanking(11111111);
		p4.doPayment();
	}

}

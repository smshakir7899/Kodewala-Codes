package com.example.app.jdbc;

import java.sql.SQLException;

public class App
{
	public static void main(String[] args)
	{
		PaymentService paymentService = new PaymentService();
		try
		{
			paymentService.updatePayment(1004, "on-hold");
			// now 1004 will change from failed to on hold

			paymentService.getAllPayment(null);
			// if put null all will print
			// if put failed only failed will show
		} catch (ClassNotFoundException | SQLException e)
		{

			e.printStackTrace();
		}
	}
}

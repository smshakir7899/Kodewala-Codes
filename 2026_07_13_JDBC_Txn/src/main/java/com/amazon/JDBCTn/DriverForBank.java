package com.amazon.JDBCTn;

import java.sql.SQLException;

public class DriverForBank
{

	public static void main(String[] args)
	{
		BankTransfer transfer = new BankTransfer();
		try
		{
			transfer.fundTransfer();
		} catch (ClassNotFoundException | SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

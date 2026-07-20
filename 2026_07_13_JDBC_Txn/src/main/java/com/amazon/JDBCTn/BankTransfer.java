package com.amazon.JDBCTn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BankTransfer
{

	public void fundTransfer() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/9th_march_2026", "root",
				"Root@123");

		try
		{
			Statement stmt = connection.createStatement();
			connection.setAutoCommit(false);
			ResultSet set = stmt.executeQuery("select balance from account WHERE id = 1");
			double balance = 0;
			while (set.next())
			{
				balance = set.getDouble(1);

			}

			System.out.println(balance);
			if (balance > 0)
			{
				String debitQuery = "UPDATE account SET balance = balance - 2000 WHERE id = 1";
				int result = stmt.executeUpdate(debitQuery);
				if (result > 0)
				{
					System.out.println("Balance debited successfully...");
				} else
				{
					throw new RuntimeException("Debit failed.");

				}
			} else
			{
				System.out.println("Insufficient balanc..");
			}
			String creditQuery = "UPDATE account SET balance = balance + 2000 WHERE id = 2";
//			String name = null;
//			name.length();
			int result = stmt.executeUpdate(creditQuery);
			if (result > 0)
			{
				System.out.println("Balance credited successfully....");
			} else
			{
				throw new RuntimeException("Credit failed.");
			}
			connection.commit();
			stmt.close();
			connection.close();
		} catch (Exception e)
		{
			System.out.println("Failed transaction...doing rollback");
			connection.rollback();
			System.out.println("Money transferred back to Rahul's account.");
			connection.close();
		}

	}
}

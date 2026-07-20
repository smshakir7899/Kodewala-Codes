package com.amazon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderMgmtPreparedStat
{
	public void updatePayment(String status, int id) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); // dynamic way of loading class
		// static way of loading class is object creation

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/9th_march_2026", "root",
				"Root@123");

		String updateQuery = "update payment set status=?,id=?";
		PreparedStatement ps = connection.prepareStatement(updateQuery);
		ps.setString(1, status);
		ps.setInt(2, id);

		int recordsUpdated = ps.executeUpdate();
		if (recordsUpdated > 0)
		{
			System.out.println("Records updated: " + recordsUpdated);
		} else
		{
			System.err.println("Unable to update the records");
		}

	}
}

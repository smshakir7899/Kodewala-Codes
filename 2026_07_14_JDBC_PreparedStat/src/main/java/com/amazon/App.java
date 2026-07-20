package com.amazon;

import java.sql.SQLException;

public class App
{
	public static void main(String[] args)
	{
		OrderMgmtPreparedStat preparedStat = new OrderMgmtPreparedStat();
		try
		{
			preparedStat.updatePayment("blocked", 1001);
		} catch (ClassNotFoundException | SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

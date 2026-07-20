package com.amazon.JDBCTn;

import java.sql.SQLException;

public class App
{
	public static void main(String[] args)
	{
		OrdrMgmt mgmt = new OrdrMgmt();
		try
		{
			mgmt.manageOrder();
		} catch (ClassNotFoundException | SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

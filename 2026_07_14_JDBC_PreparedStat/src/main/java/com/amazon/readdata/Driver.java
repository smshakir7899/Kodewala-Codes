package com.amazon.readdata;

import java.io.IOException;
import java.sql.SQLException;

public class Driver
{

	public static void main(String[] args)
	{
		FileWriterExp writerExp = new FileWriterExp();
		try
		{
			writerExp.readData();
		} catch (ClassNotFoundException | SQLException | IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package com.amazon.products.update;

import java.io.IOException;
import java.sql.SQLException;

public class DriverForPs
{

	public static void main(String[] args)
	{
		UploadProductsBatch batch = new UploadProductsBatch();
		try
		{
			batch.newproducts();
		} catch (ClassNotFoundException | SQLException | IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

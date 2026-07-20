package com.amazon.products.update;

import java.io.IOException;
import java.sql.SQLException;

public class Driver
{

	public static void main(String[] args)
	{
		UploadProducts products = new UploadProducts();
		try
		{
			products.newproducts();
		} catch (ClassNotFoundException | SQLException | IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

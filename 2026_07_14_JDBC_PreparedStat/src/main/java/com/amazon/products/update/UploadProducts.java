package com.amazon.products.update;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UploadProducts
{
	public void newproducts() throws ClassNotFoundException, SQLException, IOException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/9th_march_2026", "root",
				"Root@123");

		Statement statement = connection.createStatement();
		FileReader fileReader = new FileReader(
				"C:\\Users\\Skale\\OneDrive\\Desktop\\JAVA-KODEWALA\\9th March Batch\\2026_07_14_JDBC_PreparedStat\\src\\main\\java\\com\\amazon\\products\\update\\Products");

		BufferedReader br = new BufferedReader(fileReader);
		String line = br.readLine();

		while ((line = br.readLine()) != null)
		{
			String[] s = line.split(",");
			System.out.println(line);
			int productId = Integer.parseInt(s[0]);
			String productName = s[1];
			String category = s[2];
			int price = Integer.parseInt(s[3]);
			int stock = Integer.parseInt(s[4]);

			String updateOrderSql = "Insert into products values (" + productId + ",'" + productName + "', '" + category
					+ "'," + price + "," + stock + ")";

			int records = statement.executeUpdate(updateOrderSql);
			if (records > 0)
			{
				System.out.println("Product added successfully");
			} else
			{
				System.out.println("unable to add the product....");
			}
		}
	}
}

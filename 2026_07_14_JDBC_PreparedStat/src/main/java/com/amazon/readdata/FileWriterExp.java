package com.amazon.readdata;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FileWriterExp
{
	public void readData() throws ClassNotFoundException, SQLException, IOException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/9th_march_2026", "root",
				"Root@123");

		String writequery = "select * from products";
		Statement statement = connection.createStatement();

		FileWriter writer = new FileWriter(
				"C:\\Users\\Skale\\OneDrive\\Desktop\\JAVA-KODEWALA\\9th March Batch\\2026_07_14_JDBC_PreparedStat\\src\\main\\java\\com\\amazon\\products\\update\\Writer");
		BufferedWriter bw = new BufferedWriter(writer);

		ResultSet rs = statement.executeQuery(writequery);

		while (rs.next())
		{
			int productId = rs.getInt("productId");
			String productName = rs.getString("productName");
			String category = rs.getString("category");
			int price = rs.getInt("price");
			int stock = rs.getInt("stock");

			String line = "" + productId + "," + productName + "," + category + "," + price + "," + stock + "";
			bw.write(line);
			bw.newLine();
		}

		bw.close();
	}
}

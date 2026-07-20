package com.amazon.products.update;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UploadProductsBatch
{
	public void newproducts() throws ClassNotFoundException, SQLException, IOException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/9th_march_2026", "root",
				"Root@123");

		connection.setAutoCommit(false);

		try
		{
			String updateUsingPreparedStat = "insert into products values (?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(updateUsingPreparedStat);
			FileReader fileReader = new FileReader(
					"C:\\Users\\Skale\\OneDrive\\Desktop\\JAVA-KODEWALA\\9th March Batch\\2026_07_14_JDBC_PreparedStat\\src\\main\\java\\com\\amazon\\products\\update\\Products");
			BufferedReader br = new BufferedReader(fileReader);
			String line = br.readLine();
			int count = 0;
			while ((line = br.readLine()) != null)
			{
				String[] s = line.split(",");
				 System.out.println(line);
				int productId = Integer.parseInt(s[0]);
				String productName = s[1];
				String category = s[2];
				int price = Integer.parseInt(s[3]);
				int stock = Integer.parseInt(s[4]);
				ps.setInt(1, productId);
				ps.setString(2, productName);
				ps.setString(3, category);
				ps.setInt(4, price);
				ps.setInt(5, stock);

				ps.addBatch();
				count++;
				if (count % 20 == 0)
				{
					ps.executeBatch();
					ps.clearBatch();
					System.out.println("executing the batch....!!");
				}

			}
			ps.executeBatch();
			System.out.println("Data commited..");
			connection.commit();
			br.close();
			ps.close();
			connection.close();
		} catch (Exception e)
		{
			connection.rollback();
			System.out.println("Unable to commit...rolling back..!!!");
			connection.close();

		}

	}
}

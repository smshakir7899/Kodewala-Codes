package com.example.app.jdbc;


/*
 * ================================================================
 *                     DATABASE & JDBC NOTES
 * ================================================================
 *
 * Until now, we were storing data in Heap Memory.
 *
 * Disadvantages of storing data in memory:
 * ------------------------------------------------
 * 1. When the application stops, all data is lost.
 * 2. Restarting the application also removes all stored data.
 * 3. Heap memory is temporary, so data cannot store data permanently.
 *
 *
 * To store data permanently, we use a DATABASE. 
 * Database:
 * ------------------------------------------------
 * - A database stores data permanently.
 * - A database contains Tables.
 * - Tables contain Records (Rows).
 * - The data remains available even if the application
 *   or the system is restarted.
 *
 * Real-Life Example:
 * ------------------------------------------------
 * If you ordered something one year ago, you can still
 * view the Order ID, Invoice, Payment Status, etc.,
 * because they are stored in a database.
 *
 * A database is mainly used to:
 * - Read Data
 * - Write Data
 *
 *
 * MySQL:
 * ------------------------------------------------
 * When MySQL is installed, it creates a data directory
 * on your computer's file system (usually in the C: drive
 * or another configured location). All database data is
 * stored there permanently.
 *
 * From now on, instead of storing data in Java memory,
 * we will store it inside a database.
 *
 *
 * Java ↔️ Database Communication
 * ------------------------------------------------
 * Java cannot understand the database language directly,
 * and the database cannot understand Java.
 *
 * Example:
 * If Messi comes to India and doesn't know English,
 * a translator is needed for communication.
 *
 * Similarly, every Database Vendor (MySQL, Oracle,
 * PostgreSQL, SQL Server, etc.) provides a Driver
 * (Connector) that acts as a translator.
 *
 * Java Application
 *        ↓
 *     JDBC API
 *        ↓
 * MySQL Connector (Driver)
 *        ↓
 * MySQL Database
 *
 * JDBC (Java Database Connectivity):
 * ------------------------------------------------
 * JDBC is a Java API that allows Java applications
 * to connect and communicate with databases.
 * It uses a database-specific driver (connector)
 * to send SQL commands to the database.
 *
 *
 * Basic MySQL Commands:
 * ------------------------------------------------
 *
 * 1. Create a Database
 *    CREATE DATABASE 9th_march_2026;
 *    - Creates a new database with the specified name.
 *
 * 2. Show all Databases
 *    SHOW DATABASES;
 *    - Displays all available databases.
 *
 * 3. Select a Database
 *    USE 9th_march_2026;
 *    - Makes the selected database active.
 *
 * 4. Show all Tables
 *    SHOW TABLES;
 *    - Displays all tables inside the selected database.
 *
 * 5. Create a Table
 *    CREATE TABLE payment (
 *        id INT,
 *        refid VARCHAR(200),
 *        status VARCHAR(20)
 *    );
 *
 *    Note:
 *    - In SQL, we write Column Name first and then Data Type.
 *      Example: id INT
 *    - This is the opposite of Java.
 *      Java : int id;
 *      SQL  : id INT;
 *
 * 6. Insert Data
 *    INSERT INTO payment(id, refid, status)
 *    VALUES (10001, 'PR1234', 'paid');
 *
 *    Note:
 *    - String values are enclosed in single quotes (' ').
 *    - Every INSERT statement creates a new record (row)
 *      in the table.
 *    - Once inserted successfully, the data is stored
 *      permanently in the database.
 *
 * 7. Display all Records
 *    SELECT * FROM payment;
 *
 *    Note:
 *    - SELECT is used to retrieve (read) data from a table.
 *    - '*' means all columns of the table.
 *    - This command does not modify the data; it only displays it.
 *
 *    Display only Failed Payments
 *    SELECT * FROM payment
 *    WHERE status = 'failed';
 *
 *    - WHERE is used to filter records based on a condition.
 *
 * 8. Update a Record
 *    UPDATE payment
 *    SET status = 'paid'
 *    WHERE id = 10002;
 *
 *    Important:
 *    - Always use the WHERE clause while updating records.
 *    - Without WHERE, every record in the table will be updated.
 *
 *
 * Practice:
 * ------------------------------------------------
 * Explore SQL daily using NamasteSQL.
 *
 *
 * Real-Life Example:
 * ------------------------------------------------
 * Applications like WhatsApp store contacts, chats,
 * messages, payment details, media information, etc.,
 * inside databases.
 *
 * ================================================================
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PaymentService
{
	public void getAllPayment(String _status) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); // checked exception --> Class not found
		// this will load the MySQL JDBC Driver 

		// Creating the connection with data.
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/9th_march_2026", "root",
				"Root@123");
		// 	Driver manager is responsible for creating a connection. 
		
		// Create the statement 
		Statement stmt = connection.createStatement();
		// Statement is used to send SQL statements to database. 
		
		
		// now what if only selected payment required 
		String query = null;
		if (_status == null)
		{
			query = "select * from payment";
		} else
		{
			query = "select * from payment where status ='" + _status + "'";
		}

		//   execute query 
		// - executeQuery()    → SELECT statements 
		// - executeUpdate()   → INSERT, UPDATE, DELETE 
		ResultSet rs = stmt.executeQuery(query);

		while (rs.next())
		{
			int id = rs.getInt(1);
			String refId = rs.getString(2);
			String status = rs.getString(3);

			System.out.println("ID      : " + id);
			System.out.println("Ref ID  : " + refId);
			System.out.println("Status  : " + status);
			System.out.println("-------------------");

		}
	}

	// now if you want to update any data in your database make new method

	public void updatePayment(int _id, String _status) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/9th_march_2026", "root",
				"Root@123");

		Statement stmt = connection.createStatement();
		String sql = "update Payment set status ='" + _status + "' where id=" + _id;
		System.out.println("Query is : " + sql);
		int updatedRecords = stmt.executeUpdate(sql);
		System.out.println("Records updated =====> " + updatedRecords);
	}
}

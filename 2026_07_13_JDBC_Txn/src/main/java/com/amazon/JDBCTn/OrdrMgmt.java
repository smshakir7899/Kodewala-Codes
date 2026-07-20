
package com.amazon.JDBCTn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class OrdrMgmt
{
	public void manageOrder() throws ClassNotFoundException, SQLException
	{
		// Step 1: Load the JDBC Driver.
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2: Create a connection with the database.
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/9th_march_2026", "root",
				"Root@123");

		try
		{
			Statement statement = connection.createStatement();

			// ============================================================
			// TRANSACTION MANAGEMENT
			// ============================================================
			//
			// By default AutoCommit is TRUE.
			// This means every SQL statement is permanently saved immediately after execution.
			//
			// Here we are setting AutoCommit to FALSE.
			// After setting AutoCommit to false, all SQL statements become part of one transaction.
			//
			// The database first records the changes in WAL (Write Ahead Log) before permanently committing them. 
			// Think of WAL as a transaction log maintained by the database.
			// It helps the database recover if a crash occurs before commit().
			//
			// Until commit() is called:
			// - The transaction is NOT permanently saved.
			// - Other users normally cannot see these uncommitted changes.
			//
			// If everything executes successfully:
			// connection.commit();
			//
			// If any exception occurs:
			// connection.rollback();
			//
			// Rollback cancels all changes made in the current transaction
			// and restores the database to its previous consistent state.
			// ============================================================

			connection.setAutoCommit(false);

			// ============================================================
			// Example:
			//
			// Suppose a customer orders a mobile from Flipkart.
			//
			// Step 1 -> Create Order.
			// Step 2 -> Create Payment Record.
			// Step 3 -> Debit Customer's Money.
			// Step 4 -> Update Order Status as PAID.
			//
			// Either ALL four steps should succeed
			// OR NONE of them should be saved.
			//
			// This is called a DATABASE TRANSACTION.
			// ============================================================

			// ------------------------------------------------------------
			// Create Order Record
			// ------------------------------------------------------------
			String createOrderSql = "INSERT INTO orders(id,item,status) VALUES (1001,'NOTHING PHONE 4','CREATED')";

			int records = statement.executeUpdate(createOrderSql);

			if (records > 0)
			{
				System.out.println("Order record created");
			} else
			{
				System.out.println("Unable to create record");
			}

			// ------------------------------------------------------------
			// Create Payment Record
			// ------------------------------------------------------------
			String createPaymentSql = "INSERT INTO payment(id,refiD,status) VALUES (1001,'PR124','INIT')";

			// Uncomment these lines to simulate an exception.
			// If exception occurs, rollback() will execute.
//
//			String name = null;
//			name.length();

			records = statement.executeUpdate(createPaymentSql);

			if (records > 0)
			{
				System.out.println("Payment record created");
			} else
			{
				System.out.println("Unable to create payment record");
			}

			// ------------------------------------------------------------
			// Assume payment is successful.
			// Update payment status.
			// ------------------------------------------------------------
			String updatePaymentSql = "INSERT INTO payment(id,refiD,status) VALUES (1001,'PR124','paid')";

			records = statement.executeUpdate(updatePaymentSql);

			if (records > 0)
			{
				System.out.println("Payment record created");
			} else
			{
				System.out.println("Unable to update payment record");
			}

			// ============================================================
			// All SQL statements executed successfully.
			//
			// commit() permanently saves all changes
			// into the database.
			//
			// After commit(),
			// everyone can see the updated data.
			// ============================================================

			connection.commit();

			System.out.println("Transaction committed successfully.");
		} catch (Exception e)
		{
			System.out.println("Doing roll back...");

			// ============================================================
			// Since an error occurred, undo every SQL statement executed in this transaction. 
			// None of the changes will be permanently stored in the database. 
			// The database returns to its previous consistent state. 
			// This prevents partial or inconsistent data.
			// ============================================================

			connection.rollback();

			System.out.println("Transaction rolled back.");
		}

		// ============================================================
		// INTERVIEW NOTES
		// ============================================================
		//
		// WAL (Write Ahead Log)
		// ----------------------
		// Before permanently saving data, the database first records
		// the changes in the Write Ahead Log (WAL).
		// This improves recovery if the database crashes.
		//
		// AutoCommit = TRUE (Default)
		// ---------------------------
		// Every SQL statement is committed immediately.
		// No need to call commit().
		//
		// AutoCommit = FALSE
		// ---------------------------
		// Multiple SQL statements become one transaction.
		// Use commit() to permanently save them.
		// Use rollback() to cancel all changes if any error occurs.
		//
		// Real-life Example:
		// ------------------
		// Paytm / UPI Transfer
		//
		// 1. Money is debited from the sender's account.
		// 2. Receiver's account should be credited.
		// 3. Transaction history should be updated.
		//
		// If all steps succeed -> commit().
		//
		// If the receiver's bank server is down,
		// rollback() cancels the transaction and
		// the sender receives the money back.
		//
		// Another example:
		// Flipkart Order + Payment.
		//
		// Transaction Definition:
		// A transaction is a group of SQL statements
		// executed as one unit of work.
		//
		// Either ALL statements succeed (commit)
		// OR ALL statements fail (rollback).
		// ============================================================
	}
}

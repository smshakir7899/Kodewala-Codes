package com.kodewala.inf;

class Invoice implements DataPrintable
{
	int invoiceId;
	String customerName;

	public Invoice(int invoiceId, String customerName)
	{
		super();
		this.invoiceId = invoiceId;
		this.customerName = customerName;
	}

}

class Receipt
{
	int receiptId;
	String shopName;

	public Receipt(int receiptId, String shopName)
	{
		super();
		this.receiptId = receiptId;
		this.shopName = shopName;
	}

}

class Password
{
	String password;

	public Password(String password)
	{
		super();
		this.password = password;
	}

}

class PrintManager
{
	public void print(Object obj)
	{
		if (obj instanceof DataPrintable)
		{
			Invoice inv = (Invoice) obj;
			System.out.println("Invoice ID: " + inv.invoiceId);
			System.out.println("Customer Name: " + inv.customerName);

//			Receipt rec = (Receipt) obj;
//			System.out.println("Reciept ID: " + rec.receiptId);
//			System.out.println("Shop Name: " + rec.shopName);
//
//			Password pass = (Password)obj;
//			System.out.println("Password: " + pass.password);
		} else
		{
			throw new RuntimeException("DataNotPrintableException");
//			System.err.println("DataNotPrintableException...");
		}
	}

	 
}

public class Driver
{

	public static void main(String[] args)
	{
		Invoice invoice = new Invoice(1243, "Shakir");
		Receipt receipt = new Receipt(101, "Kodewala Store");
		Password pwd = new Password("13454311");

		PrintManager manager = new PrintManager();
		manager.print(invoice);
		manager.print(pwd); // you can see here you get DataNotPrintableException... as we are not 
	}

}

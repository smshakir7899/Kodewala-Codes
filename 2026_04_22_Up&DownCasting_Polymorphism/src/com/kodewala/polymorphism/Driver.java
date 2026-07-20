package com.kodewala.polymorphism;

class InvoiceMgmt
{
 
}

class GSTMgmt extends InvoiceMgmt
{
	 
}
public class Driver
{

	public static void main(String[] args)
	{
 
		GSTMgmt gstMgmt =  new GSTMgmt(); // Creating an object 
		
		
		InvoiceMgmt invoiceMgmt = new GSTMgmt(); // --> this is AUTOupcasting
		// AUTOupcasting --> parent class can refer child class object
		//this statement is like --> InvoiceMgmt invoiceMgmt =(InvoiceMgmt) new GSTMgmt();
		// but this is automatic process...we do not have to mention it.
		
		//GSTMgmt gstMgmt2 = new InvoiceMgmt(); 
		//this gives error as downcasting is not automatic. 
		
		GSTMgmt gstMgmt2 = (GSTMgmt) new InvoiceMgmt(); // --> this is downcasting
		// bade logo ko bauno se ya bacho se baat krne k liye jhukna padta hai wohi hai down casting
		
		
		
		
	}

}

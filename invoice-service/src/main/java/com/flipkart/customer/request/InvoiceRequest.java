package com.flipkart.customer.request;

public class InvoiceRequest
{

	private String customerName;
	private int gst;
	private String status;

	public String getCustomerName()
	{
		return customerName;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	public int getGst()
	{
		return gst;
	}

	public void setGst(int gst)
	{
		this.gst = gst;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

}

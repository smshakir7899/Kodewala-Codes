package com.amazon.user.beans;

public class Customer
{

	String customerId;
	String customerName;
	String city;

	public void displayCustomerDetails()
	{
		System.out.println("Customer Details.............");
		System.out.println("ID: " + customerId);
		System.out.println("Name: " + customerName);
		System.out.println("City: " + city);
		System.out.println(".............................");
		System.out.println();
	}

	public String getCustomerId()
	{
		return customerId;
	}

	public void setCustomerId(String customerId)
	{
		this.customerId = customerId;
	}

	public String getCustomerName()
	{
		return customerName;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}
}

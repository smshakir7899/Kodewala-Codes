package com.amazon.user.beans;

public class Order
{
	String orderId;
	int quantity;
	boolean status;

	public void displayOrderDetails()
	{
		System.out.println("Order Details................");
		System.out.println("ID: " + orderId);
		System.out.println("Quantity: " + quantity);
		System.out.println("Status: " + status);
		System.out.println(".............................");
		System.out.println();
	}

	public String getOrderId()
	{
		return orderId;
	}

	public void setOrderId(String orderId)
	{
		this.orderId = orderId;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	public boolean isStatus()
	{
		return status;
	}

	public void setStatus(boolean status)
	{
		this.status = status;
	}

}

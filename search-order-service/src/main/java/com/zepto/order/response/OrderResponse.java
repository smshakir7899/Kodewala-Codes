package com.zepto.order.response;

public class OrderResponse
{

	private int id;
	private int orderId;
	private int customerId;
	private String productId;
	private int quantity;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getOrderId()
	{
		return orderId;
	}

	public void setOrderId(int orderId)
	{
		this.orderId = orderId;
	}

	public int getCustomerId()
	{
		return customerId;
	}

	public void setCustomerId(int customerId)
	{
		this.customerId = customerId;
	}

	public String getProductId()
	{
		return productId;
	}

	public void setProductId(String string)
	{
		this.productId = string;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

}

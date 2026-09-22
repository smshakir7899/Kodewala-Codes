package com.flipkart.customer.order.request;

public class OrderRequest
{
	private String orderNumber;
	private Double totalAmount;
	private String status;
	private String customerId;

	public String getOrderNumber()
	{
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber)
	{
		this.orderNumber = orderNumber;
	}

	public Double getTotalAmount()
	{
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount)
	{
		this.totalAmount = totalAmount;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getCustomerId()
	{
		return customerId;
	}

	public void setCustomerId(String customerId)
	{
		this.customerId = customerId;
	}

}

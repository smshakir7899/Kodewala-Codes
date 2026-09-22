package com.flipkart.customer.order.request.respomse;

public class OrderResponse
{
	private int id;
	private String orderNumber;
	private Double totalAmount;
	private String status;
	private Long customerId;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

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

	public Long getCustomerId()
	{
		return customerId;
	}

	public void setCustomerId(Long customerId)
	{
		this.customerId = customerId;
	}

}

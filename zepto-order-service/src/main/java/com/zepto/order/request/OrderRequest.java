package com.zepto.order.request;

public class OrderRequest
{

	private int customerId;
	private String productId;
	private int quantity;
	private String paymentMethod;
	private String shippingAddress;
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
	public void setProductId(String productId)
	{
		this.productId = productId;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	public String getPaymentMethod()
	{
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod)
	{
		this.paymentMethod = paymentMethod;
	}
	public String getShippingAddress()
	{
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress)
	{
		this.shippingAddress = shippingAddress;
	}
	
	
	
}

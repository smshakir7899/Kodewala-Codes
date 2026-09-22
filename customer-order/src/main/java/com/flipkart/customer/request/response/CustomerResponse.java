package com.flipkart.customer.request.response;

import java.util.List;

import com.flipkart.customer.order.request.respomse.OrderResponse;

public class CustomerResponse
{
	private Long id;
	private String name;
	private String email;

	private List<OrderResponse> orders;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public List<OrderResponse> getOrders()
	{
		return orders;
	}

	public void setOrders(List<OrderResponse> orders)
	{
		this.orders = orders;
	}

}

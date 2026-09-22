package com.flipkart.customer.order.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.flipkart.customer.entity.CustomerEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderEntity
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String orderNumber;
	private LocalDateTime orderDate;
	private Double totalAmount;
	private String status;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	@JsonIgnore // as in postman response is forming a nested loop
	private CustomerEntity customer;

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

	public LocalDateTime getOrderDate()
	{
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate)
	{
		this.orderDate = orderDate;
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

	public CustomerEntity getCustomer()
	{
		return customer;
	}

	public void setCustomer(CustomerEntity customer)
	{
		this.customer = customer;
	}

}

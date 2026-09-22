package com.flipkart.customer.order.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.customer.entity.CustomerEntity;
import com.flipkart.customer.order.entity.OrderEntity;
import com.flipkart.customer.order.repository.OrderRepository;
import com.flipkart.customer.order.request.OrderRequest;
import com.flipkart.customer.order.request.respomse.OrderResponse;
import com.flipkart.customer.repository.CustomerRepository;

@Service
public class OrderService
{
	@Autowired
	OrderRepository orderRepository;

	@Autowired
	CustomerRepository customerRepository;

	public OrderResponse createOrder(OrderRequest orderRequest)
	{
		String customerId = orderRequest.getCustomerId(); // finding that order is of which customer
		CustomerEntity parentEntity = customerRepository.findById(Long.valueOf(customerId)).get();
		// here customerId is string so first converting it into long then,
		// findById ---> it will search in database & .get will get us the output

		OrderEntity childEntity = new OrderEntity();
		childEntity.setCustomer(parentEntity);
		childEntity.setOrderNumber(orderRequest.getOrderNumber());
		childEntity.setOrderDate(LocalDateTime.now());
		childEntity.setTotalAmount(orderRequest.getTotalAmount());
		childEntity.setStatus("PLACED");

		OrderEntity savedOrder = orderRepository.save(childEntity);

		OrderResponse orderResponse = new OrderResponse();
		orderResponse.setId(savedOrder.getId());
		orderResponse.setCustomerId(savedOrder.getCustomer().getId());
		orderResponse.setOrderNumber(savedOrder.getOrderNumber());
		orderResponse.setTotalAmount(savedOrder.getTotalAmount());
		orderResponse.setStatus(savedOrder.getStatus());

		return orderResponse;

	}
}

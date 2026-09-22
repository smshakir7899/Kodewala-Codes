package com.zepto.order.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.order.entity.OrderEntity;
import com.zepto.order.repository.OrderRepository;
import com.zepto.order.response.OrderResponse;

@Service
public class OrderService
{
	@Autowired
	private OrderRepository orderRepository;

	public OrderResponse getOrderById(int orderId)
	{
		System.out.println("OrderService.getOrderById()::::::::::::START");
		OrderEntity entity = orderRepository.findById(orderId).get();

		OrderResponse response = new OrderResponse();
		response.setId(entity.getId());
		response.setOrderId(entity.getOrderId());
		response.setCustomerId(entity.getCustomerId());
		response.setProductId(entity.getProductId());
		response.setQuantity(entity.getQuantity());
		System.out.println("OrderService.getOrderById()::::::::::::::END");
		return response;
	}

	public List<OrderResponse> getOrdersByPayType(String paymentType)
	{
		List<OrderEntity> orderEntities = orderRepository.findOrderByPaymentType(paymentType);

		List<OrderResponse> response = new ArrayList<>();

		for (OrderEntity entity : orderEntities)
		{

			OrderResponse orderResponse = new OrderResponse();
			orderResponse.setId(entity.getId());
			orderResponse.setOrderId(entity.getOrderId());
			orderResponse.setCustomerId(entity.getCustomerId());
			orderResponse.setProductId(entity.getProductId());
			orderResponse.setQuantity(entity.getQuantity());
			response.add(orderResponse);
		}

		return response;
	}
}

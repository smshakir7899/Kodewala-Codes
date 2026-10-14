package com.flipkart.order.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.order.client.PaymentServiceClient;
import com.flipkart.order.client.request.PaymentRequest;
import com.flipkart.order.entity.OrderEntity;
import com.flipkart.order.repository.OrderRepository;
import com.flipkart.order.request.OrderRequest;
import com.flipkart.order.response.OrderResponse;

@Service
public class OrderService
{

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	PaymentServiceClient serviceClient;

	private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

//	public OrderService(PaymentServiceClient paymentServiceClient)
//	{
//		this.serviceClient = paymentServiceClient;
//	}

//	public String getCategories()
//	{
//		return serviceClient.makePayment(null);
//	}

//	public OrderService(OrderRepository repository)
//	{
//		this.orderRepository = repository;
//	}

	// Create a new order
	public OrderResponse createOrder(OrderRequest orderRequest)
	{

		OrderEntity entity = new OrderEntity();

		logger.info("Creating order for customer: {}", orderRequest.getCustomerName());
		String orderId = "ORD-" + UUID.randomUUID();
		entity.setOrderId(orderId);
		entity.setCustomerName(orderRequest.getCustomerName());
		entity.setProductId(orderRequest.getProductId());
		entity.setQuantity(orderRequest.getQuantity());
		entity.setAmount(orderRequest.getAmount());
		entity.setDeliveryAddress(orderRequest.getDeliveryAddress());
		entity.setStatus("CREATED");

		logger.info("Calling Payment Service through Feign");

		PaymentRequest paymentRequest = new PaymentRequest();
		paymentRequest.setAmount(orderRequest.getAmount());
		paymentRequest.setCustomerName(orderRequest.getCustomerName());
		paymentRequest.setOrderId(orderId);

		String paymentResponse = serviceClient.makePayment(paymentRequest);

		logger.info("Payment service response: {}", paymentResponse);

		OrderEntity savedEntity = orderRepository.save(entity);

		logger.info("Order saved successfully with orderId: {}", savedEntity.getOrderId());

		OrderResponse response = convertToResponse(savedEntity);

		logger.info("Order response created successfully for orderId: {}", savedEntity.getOrderId());

		return response;
	}

	// Get all orders
	public List<OrderResponse> getAllOrders()
	{

		List<OrderEntity> orders = orderRepository.findAll();

		List<OrderResponse> responses = new ArrayList<>();

		for (OrderEntity entity : orders)
		{
			responses.add(convertToResponse(entity));
		}

		return responses;
	}

	// Convert Entity to Response
	private OrderResponse convertToResponse(OrderEntity entity)
	{

		OrderResponse response = new OrderResponse();

		response.setId(entity.getId());
		response.setOrderId(entity.getOrderId());
		response.setCustomerName(entity.getCustomerName());
		response.setProductId(entity.getProductId());
		response.setQuantity(entity.getQuantity());
		response.setAmount(entity.getAmount());
		response.setDeliveryAddress(entity.getDeliveryAddress());
		response.setStatus(entity.getStatus());
		response.setCreatedAt(entity.getCreatedAt());
		response.setUpdatedAt(entity.getUpdatedAt());

		return response;
	}
}

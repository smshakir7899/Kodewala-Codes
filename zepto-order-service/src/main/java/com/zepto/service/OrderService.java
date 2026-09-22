package com.zepto.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.OrderEntity;
import com.zepto.order.request.OrderRequest;
import com.zepto.repository.OrderRepository;
import com.zepto.response.OrderResponse;
import com.zepto.service.kafka.KafkaService;

import tools.jackson.databind.ObjectMapper;

@Service
public class OrderService
{

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	KafkaService kafkaService;

	public OrderResponse acceptOrder(OrderRequest orderRequest)
	{
		System.out.println("OrderService.acceptOrder()----------START");
		OrderEntity entity = new OrderEntity();
		entity.setCustomerId(orderRequest.getCustomerId());
		entity.setProductId(orderRequest.getProductId());
		entity.setQuantity(orderRequest.getQuantity());
		entity.setPaymentMethod(orderRequest.getPaymentMethod());
		entity.setShippingAddress(orderRequest.getShippingAddress());

		// Biz logic
		entity.setOrderId(generateOrderId());
		OrderEntity responseEntity = orderRepository.save(entity);

		OrderResponse orderResponse = new OrderResponse();
		orderResponse.setOrderId(responseEntity.getOrderId());
		orderResponse.setCustomerId(responseEntity.getCustomerId());
		orderResponse.setTotalAmount(2312);
		orderResponse.setPaymentStatus("SUCCESS");
		orderResponse.setOrderStatus("PLACED");

		System.out.println("OrderService.acceptOrder()------------END");

		if (responseEntity.getId() > 0)
		{
			System.out.println("OrderService.acceptOrder():::::::::::::::order placedd sending msg to kafka");
			String data = objToJson(orderResponse);
			kafkaService.storingMessage("order_place", data);
		}
		return orderResponse;
	}

	private int generateOrderId()
	{
		Random random = new Random();
		int id = 1000 + random.nextInt(90000);
		return id;
	}

	private String objToJson(OrderResponse response)
	{
		ObjectMapper objectMapper = new ObjectMapper();

		String json = objectMapper.writeValueAsString(response);
		return json;
	}

}

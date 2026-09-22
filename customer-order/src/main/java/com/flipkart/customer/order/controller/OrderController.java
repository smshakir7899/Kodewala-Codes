package com.flipkart.customer.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.customer.order.request.OrderRequest;
import com.flipkart.customer.order.request.respomse.OrderResponse;
import com.flipkart.customer.order.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController
{

	@Autowired
	OrderService orderService;

	@PostMapping("/create")
	public ResponseEntity<OrderResponse> createOrder(@RequestBody OrderRequest orderRequest)
	{
		OrderResponse response = orderService.createOrder(orderRequest);
		return ResponseEntity.status(HttpStatus.OK).body(response);

	}
}

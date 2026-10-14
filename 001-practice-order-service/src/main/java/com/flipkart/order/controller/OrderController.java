package com.flipkart.order.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.order.request.OrderRequest;
import com.flipkart.order.response.OrderResponse;
import com.flipkart.order.service.OrderService;

@RestController
@RequestMapping("orders")
public class OrderController
{

	private final OrderService orderService;

	private static final Logger Log = LoggerFactory.getLogger(OrderController.class);

	public OrderController(OrderService service)
	{
		this.orderService = service;
	}

	@PostMapping("create")
	public ResponseEntity<OrderResponse> generateInvoice(@RequestBody OrderRequest request)
	{
		Log.info("Recieved request to create invoice for customer: {}", request.getCustomerName());
		OrderResponse invoice = orderService.createOrder(request);
		Log.info("Invoice creation request complete successfullly for customer: {}", request.getCustomerName());

		return ResponseEntity.status(HttpStatus.OK).body(invoice);

	}

	@GetMapping("list")
	public ResponseEntity<List<OrderResponse>> getAllInvoices()
	{

		Log.info("Recieved request to fetch orders - page: {}, size: {}");
		List<OrderResponse> response = orderService.getAllOrders();
		Log.info("Orders list request complete successfully - page: {}, size: {}");

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(response);
	}
}

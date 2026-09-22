package com.flipkart.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.customer.order.entity.OrderEntity;
import com.flipkart.customer.request.CustomerRequest;
import com.flipkart.customer.request.response.CustomerResponse;
import com.flipkart.customer.service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController
{
	@Autowired
	CustomerService customerService;

	@PostMapping("/create")
	public ResponseEntity<CustomerResponse> createCustomer(@RequestBody CustomerRequest customerRequest)
	{
		CustomerResponse response = customerService.createCustomer(customerRequest);
		return ResponseEntity.status(HttpStatus.OK).body(response);

	}

	@GetMapping("/showCustomers")
	public List<CustomerResponse> listAllCustomers()
	{
		return customerService.showAllCustomers();
	}

	@GetMapping("/{id}")
	public ResponseEntity<CustomerResponse> getCustomerById(@PathVariable Long id)
	{
		CustomerResponse response = customerService.getCustomerById(id);
		return ResponseEntity.status(HttpStatus.OK).body(response);

	}

	@GetMapping("/{id}/orders")
	public ResponseEntity<List<OrderEntity>> getOrdersOfCustomer(@PathVariable Long id)
	{
		List<OrderEntity> orders = customerService.getOrdersOfCustomer(id);
		return ResponseEntity.status(HttpStatus.OK).body(orders);
	}
}

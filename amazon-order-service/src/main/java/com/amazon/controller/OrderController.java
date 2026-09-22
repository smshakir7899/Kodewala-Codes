package com.amazon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.amazon.request.OrderRequest;

@Controller
public class OrderController
{
	@GetMapping("orders/{id}")
	public String viewOrderDetails(@PathVariable("id") String id)
	{
		System.out.println("Recieved order id is: " + id);
		return "order-detail";
	}

	@PostMapping("placeOrder")
	public String placeOrder(@ModelAttribute OrderRequest orderRequest)
	{

		System.out.println("Item Name      : " + orderRequest.getItem());
		System.out.println("Quantity       : " + orderRequest.getQuantity());
		System.out.println("Description    : " + orderRequest.getDesc());
		System.out.println("Address        : " + orderRequest.getAddress());
		System.out.println("Mobile Number  : " + orderRequest.getNumber());
		return "order-placed";
	}

}

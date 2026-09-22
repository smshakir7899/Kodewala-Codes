package com.flipkart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderStatusController
{
	@GetMapping("orderstatus")
	public String checkOrderStatus(@RequestParam("orderid") String orderId)
	{
		System.out.println("Inputed order id: " + orderId);
		if (orderId.startsWith("1"))
		{
			return "in-transit";
		} else if(orderId.startsWith("2"))
		{
			return "delivered";
		}
		
		return "invaid-id";
	}
}

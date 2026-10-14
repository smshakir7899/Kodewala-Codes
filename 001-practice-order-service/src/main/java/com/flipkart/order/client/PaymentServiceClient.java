package com.flipkart.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.flipkart.order.client.request.PaymentRequest;

@FeignClient(name = "002-practice-payment-service")
public interface PaymentServiceClient
{

	@PostMapping("payments/create")
	String makePayment(PaymentRequest request);
}

package com.flipkart.payment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.flipkart.payment.entity.PaymentEntity;
import com.flipkart.payment.repository.PaymentRepository;
import com.flipkart.payment.request.PaymentRequest;
import com.flipkart.payment.response.PaymentResponse;

@Service
public class PaymentService
{

	private final PaymentRepository paymentRepository;

	private static final Logger logger = LoggerFactory.getLogger(PaymentService.class);

	public PaymentService(PaymentRepository paymentRepository)
	{
		this.paymentRepository = paymentRepository;
	}

	// Create a new payment
	public PaymentResponse createPayment(PaymentRequest paymentRequest)
	{

		PaymentEntity entity = new PaymentEntity();

		entity.setPaymentId("PAY-" + UUID.randomUUID());
		entity.setOrderId(paymentRequest.getOrderId());
		entity.setCustomerName(paymentRequest.getCustomerName());
		entity.setAmount(paymentRequest.getAmount());
		entity.setStatus("SUCCESS");
		entity.setTransactionId("TXN-" + UUID.randomUUID());

		PaymentEntity savedEntity = paymentRepository.save(entity);

		logger.info("Payment saved successfully with paymentId: {}", savedEntity.getPaymentId());

		PaymentResponse response = convertToResponse(savedEntity);

		logger.info("Payment response created for paymentId: {}", savedEntity.getPaymentId());

		return response;
	}

	// Get all payments
	public List<PaymentResponse> getAllPayments()
	{

		List<PaymentEntity> payments = paymentRepository.findAll();

		List<PaymentResponse> responses = new ArrayList<>();

		for (PaymentEntity entity : payments)
		{
			responses.add(convertToResponse(entity));
		}

		return responses;
	}

	// Convert Entity to Response
	private PaymentResponse convertToResponse(PaymentEntity entity)
	{

		PaymentResponse response = new PaymentResponse();

		response.setId(entity.getId());
		response.setPaymentId(entity.getPaymentId());
		response.setOrderId(entity.getOrderId());
		response.setCustomerName(entity.getCustomerName());
		response.setAmount(entity.getAmount());
		response.setStatus(entity.getStatus());
		response.setTransactionId(entity.getTransactionId());
		response.setCreatedAt(entity.getCreatedAt());
		response.setUpdatedAt(entity.getUpdatedAt());

		return response;
	}
}

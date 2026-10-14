package com.flipkart.payment.controller;

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

import com.flipkart.payment.request.PaymentRequest;
import com.flipkart.payment.response.PaymentResponse;
import com.flipkart.payment.service.PaymentService;

@RestController
@RequestMapping("payments")
public class PaymentController {

    private final PaymentService paymentService;

    private static final Logger Log =
            LoggerFactory.getLogger(PaymentController.class);

    public PaymentController(PaymentService service) {
        this.paymentService = service;
    }

    @PostMapping("create")
    public ResponseEntity<PaymentResponse> createPayment(
            @RequestBody PaymentRequest request) {

        Log.info("Received request to create payment for order: {}",
                request.getOrderId());

        PaymentResponse response = paymentService.createPayment(request);

        Log.info("Payment creation completed successfully for order: {}",
                request.getOrderId());

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("list")
    public ResponseEntity<List<PaymentResponse>> getAllPayments() {

        Log.info("Received request to fetch all payments");

        List<PaymentResponse> response = paymentService.getAllPayments();

        Log.info("Payment list request completed successfully");

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
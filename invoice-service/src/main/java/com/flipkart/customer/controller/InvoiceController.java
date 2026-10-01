package com.flipkart.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.customer.request.InvoiceRequest;
import com.flipkart.customer.response.InvoiceResponse;
import com.flipkart.customer.service.InvoiceService;

@RestController
@RequestMapping("invoice")
public class InvoiceController
{
	@Autowired
	InvoiceService invoiceService;

	@PostMapping("create")
	public ResponseEntity<InvoiceResponse> generateInvoice(@RequestBody InvoiceRequest request)
	{
		InvoiceResponse invoice = invoiceService.createInvoice(request);
		return ResponseEntity.status(HttpStatus.OK).body(invoice);

	}

	@GetMapping("list")
	public ResponseEntity<List<InvoiceResponse>> getAllInvoices(@RequestParam int page, @RequestParam int size)
	{
		List<InvoiceResponse> response = invoiceService.getInvoices(page, size);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(response);
	}
}

package com.flipkart.customer.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	private static final Logger log = LoggerFactory.getLogger(InvoiceController.class);

	@PostMapping("create")
	public ResponseEntity<InvoiceResponse> generateInvoice(@RequestBody InvoiceRequest request)
	{
		log.info("Recieved request to create invoice for customer: {}", request.getCustomerName());
		InvoiceResponse invoice = invoiceService.createInvoice(request);
		log.info("Invoice creation request complete successfullly for customer: {}", request.getCustomerName());

		return ResponseEntity.status(HttpStatus.OK).body(invoice);

	}

	@GetMapping("list")
	public ResponseEntity<List<InvoiceResponse>> getAllInvoices(@RequestParam int page, @RequestParam int size)
	{

		log.info("Recieved request to fetch invoices - page: {}, size: {}", page, size);
		List<InvoiceResponse> response = invoiceService.getInvoices(page, size);
		log.info("Invoice list request complete successfully - page: {}, size: {}", page, size);

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(response);
	}
}

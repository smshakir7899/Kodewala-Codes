//package com.flipkart.customer.service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.annotation.Cacheable;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
//import com.flipkart.customer.entity.InvoiceEntity;
//import com.flipkart.customer.repository.InvoiceRepository;
//import com.flipkart.customer.request.InvoiceRequest;
//import com.flipkart.customer.response.InvoiceResponse;
//
//@Service
//public class InvoiceService
//{
//
//	@Autowired
//	InvoiceRepository invoiceRepository;
//
//	private static final Logger logger = LoggerFactory.getLogger(InvoiceService.class);
//
//	public InvoiceResponse createInvoice(InvoiceRequest invoiceRequest)
//	{
//
//		logger.info("Creating invoice for customer: {}", invoiceRequest.getCustomerName());
//
//		InvoiceEntity entity = new InvoiceEntity();
//		Random random = new Random();
//
//		entity.setCustomerName(invoiceRequest.getCustomerName());
//		entity.setInvId("INV-" + random.nextInt(9000));
//		entity.setGst(invoiceRequest.getGst());
//		entity.setStatus("PAID");
//
//		InvoiceEntity responseEntity = invoiceRepository.save(entity);
//
//		logger.info("Invoice created successfully with ID: {}", responseEntity.getInvId());
//
//		InvoiceResponse response = new InvoiceResponse();
//
//		if (responseEntity.getId() > 0)
//		{
//			response.setId(responseEntity.getId());
//			response.setCustomerName(responseEntity.getCustomerName());
//			response.setInvId(responseEntity.getInvId());
//			response.setGst(responseEntity.getGst());
//			response.setStatus(responseEntity.getStatus());
//		}
//
//		return response;
//	}
//
//	// Get invoices with pagination
//
//	// Redis cache key example
//
//	// invoices::0-2 invoices::1-10 invoices::2-10
//	// First request -> DataBase subsequent request -> Redis
//
//	@Cacheable(value = "invoices", key = "#page + '-' + #size")
//	public List<InvoiceResponse> getInvoices(int page, int size)
//	{
//
//		logger.info("Fetching invoices for page: {} and size: {}", page, size);
//
//		Pageable pageable = PageRequest.of(page, size);
//		Page<InvoiceEntity> result = invoiceRepository.findAll(pageable);
//
//		List<InvoiceResponse> response = new ArrayList<InvoiceResponse>();
//
//		for (InvoiceEntity invoiceEntity : result)
//		{
//
//			InvoiceResponse invoiceResponse = new InvoiceResponse();
//
//			invoiceResponse.setId(invoiceEntity.getId());
//			invoiceResponse.setInvId(invoiceEntity.getInvId());
//			invoiceResponse.setCustomerName(invoiceEntity.getCustomerName());
//			invoiceResponse.setGst(invoiceEntity.getGst());
//			invoiceResponse.setStatus(invoiceEntity.getStatus());
//
//			response.add(invoiceResponse);
//		}
//
//		logger.info("Successfully fetched {} invoices", response.size());
//
//		return response;
//	}
//}

package com.flipkart.customer.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.flipkart.customer.entity.InvoiceEntity;
import com.flipkart.customer.repository.InvoiceRepository;
import com.flipkart.customer.request.InvoiceRequest;
import com.flipkart.customer.response.InvoiceResponse;

@Service
public class InvoiceService
{

	@Autowired
	InvoiceRepository invoiceRepository;

	private static final Logger logger = LoggerFactory.getLogger(InvoiceService.class);

	public InvoiceResponse createInvoice(InvoiceRequest invoiceRequest)
	{

		logger.info("Creating invoice for customer: {}", invoiceRequest.getCustomerName());

		InvoiceEntity entity = new InvoiceEntity();
		Random random = new Random();

		entity.setCustomerName(invoiceRequest.getCustomerName());
		entity.setInvId("INV-" + random.nextInt(9000));
		entity.setGst(invoiceRequest.getGst());
		entity.setStatus("PAID");

		logger.debug("Saving invoice with invoice ID: {}", entity.getInvId());

		InvoiceEntity responseEntity = invoiceRepository.save(entity);

		logger.info("Invoice saved successfully with database ID: {}", responseEntity.getId());

		InvoiceResponse response = new InvoiceResponse();

		if (responseEntity.getId() > 0)
		{

			response.setId(responseEntity.getId());
			response.setCustomerName(responseEntity.getCustomerName());
			response.setInvId(responseEntity.getInvId());
			response.setGst(responseEntity.getGst());
			response.setStatus(responseEntity.getStatus());

			logger.info("Invoice response created successfully for invoice ID: {}", responseEntity.getId());
		}

		return response;
	}

	// Get invoices with pagination

	// Redis cache key example

	// invoices::0-2 invoices::1-10 invoices::2-10
	// First request -> DataBase subsequent request -> Redis

	@Cacheable(value = "invoices", key = "#page + '-' + #size")
	public List<InvoiceResponse> getInvoices(int page, int size)
	{

		logger.info("Fetching invoices - page: {}, size: {}", page, size);

		logger.debug("Fetching invoices from DATABASE...");

		Pageable pageable = PageRequest.of(page, size);
		Page<InvoiceEntity> result = invoiceRepository.findAll(pageable);

		logger.info("Fetched {} invoices from database for page: {}, size: {}", result.getNumberOfElements(), page,
				size);

		List<InvoiceResponse> response = new ArrayList<InvoiceResponse>();

		for (InvoiceEntity invoiceEntity : result)
		{

			InvoiceResponse invoiceResponse = new InvoiceResponse();

			invoiceResponse.setId(invoiceEntity.getId());
			invoiceResponse.setInvId(invoiceEntity.getInvId());
			invoiceResponse.setCustomerName(invoiceEntity.getCustomerName());
			invoiceResponse.setGst(invoiceEntity.getGst());
			invoiceResponse.setStatus(invoiceEntity.getStatus());

			response.add(invoiceResponse);
		}

		logger.info("Successfully prepared {} invoice responses", response.size());

		return response;
	}
}

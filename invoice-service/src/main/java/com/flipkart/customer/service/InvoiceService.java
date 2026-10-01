package com.flipkart.customer.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
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

	public InvoiceResponse createInvoice(InvoiceRequest invoiceRequest)
	{
		InvoiceEntity entity = new InvoiceEntity();
		Random random = new Random();

		entity.setCustomerName(invoiceRequest.getCustomerName());
		entity.setInvId("INV-" + random.nextInt(9000));
		entity.setGst(invoiceRequest.getGst());
		entity.setStatus("PAID");

		InvoiceEntity responseEntity = invoiceRepository.save(entity);

		InvoiceResponse response = new InvoiceResponse();

		if (responseEntity.getId() > 0)
		{
			response.setId(responseEntity.getId());
			response.setCustomerName(responseEntity.getCustomerName());
			response.setInvId(responseEntity.getInvId());
			response.setGst(responseEntity.getGst());
			response.setStatus(responseEntity.getStatus());
		}
		return response;
	}

	public List<InvoiceResponse> getInvoices(int page, int size)
	{
		Pageable pageable = PageRequest.of(page, size);
		Page<InvoiceEntity> result = invoiceRepository.findAll(pageable);

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
		return response;
	}
}

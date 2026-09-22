package com.flipkart.customer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.customer.entity.CustomerEntity;
import com.flipkart.customer.order.entity.OrderEntity;
import com.flipkart.customer.repository.CustomerRepository;
import com.flipkart.customer.request.CustomerRequest;
import com.flipkart.customer.request.response.CustomerResponse;

@Service
public class CustomerService
{
	@Autowired
	CustomerRepository customerRepository;

	public CustomerResponse createCustomer(CustomerRequest customerRequest)
	{
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setName(customerRequest.getName());
		customerEntity.setEmail(customerRequest.getEmail());

		CustomerEntity savedCustomer = customerRepository.save(customerEntity);

		CustomerResponse customerResponse = new CustomerResponse();
		customerResponse.setId(savedCustomer.getId());
		customerResponse.setName(savedCustomer.getName());
		customerResponse.setEmail(savedCustomer.getEmail());

		return customerResponse;

	}

	public List<CustomerResponse> showAllCustomers()
	{
		Iterable<CustomerEntity> customers = customerRepository.showAllCustomers();

		List<CustomerResponse> responseList = new ArrayList<>();
		// this list is use for store customer response object

		// now using for loop we will access customer entity one by one
		for (CustomerEntity customerEntity : customers)
		{
			// We will make customer response for every customer entity
			CustomerResponse customerResponse = new CustomerResponse();

			customerResponse.setId(customerEntity.getId());
			customerResponse.setName(customerEntity.getName());
			customerResponse.setEmail(customerEntity.getEmail());

			responseList.add(customerResponse);
			// System.out.println(customerEntity.getName());
			// System.out.println(customerEntity.getId());

			List<OrderEntity> orders = customerEntity.getOrders();
			System.out.println("Total Orders are: " + orders);
		}
		return responseList;
	}

	public CustomerResponse getCustomerById(Long id)
	{
		CustomerEntity customerEntity = customerRepository.findById(id).get();
		CustomerResponse customerResponse = new CustomerResponse();
		customerResponse.setId(customerEntity.getId());
		customerResponse.setName(customerEntity.getName());
		customerResponse.setEmail(customerEntity.getEmail());
		return customerResponse;

	}

	public List<OrderEntity> getOrdersOfCustomer(Long customerId)
	{
		CustomerEntity customerEntity = customerRepository.findById(customerId).get();
		return customerEntity.getOrders();
	}
}

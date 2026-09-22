package com.flipkart.customer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.flipkart.customer.entity.CustomerEntity;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, Long>
{

	@Query("SELECT c FROM CustomerEntity c LEFT JOIN FETCH c.orders ")
	public List<CustomerEntity> showAllCustomers();
}

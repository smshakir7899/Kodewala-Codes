package com.flipkart.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flipkart.customer.entity.InvoiceEntity;

public interface InvoiceRepository extends JpaRepository<InvoiceEntity, Integer>
// 2 major advantage of using jpa repository one is pagination i.e. only some data are in first page then you click next and get more data....
// jPA --> curd + advance
{

}

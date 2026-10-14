package com.flipkart.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCaching
@EnableFeignClients
@SpringBootApplication
public class InvoiceServiceApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(InvoiceServiceApplication.class, args);
	}

}

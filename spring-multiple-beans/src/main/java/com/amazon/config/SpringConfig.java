package com.amazon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.amazon.payment.Payment;

@Configuration
@ComponentScan(basePackages = "com.amazon")
public class SpringConfig
{
	@Bean("upi")
	public Payment upi()
	{
		return new Payment("REF-UPI-12345");
	}

	@Primary
	@Bean("card")
	public Payment card()
	{
		return new Payment("REF-CARD-12345");
	}
}

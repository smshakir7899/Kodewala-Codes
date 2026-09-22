package com.amazon.account.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazon.account.beans.Account;

@Configuration // This(@Configuration) tells that this class is source of bean definition
public class SpringConfig
{
	// How do we define the bean
	@Bean("acc1")
	public Account createAccount()
	{

		Account acc = new Account();
		acc.setAccountHolderName("Sayyed Shakir");
		acc.setIfscCode("SBIN0031762");
		acc.setAccountNumber("61284099878");

		return acc;
	}

}
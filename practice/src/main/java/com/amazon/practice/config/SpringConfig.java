package com.amazon.practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazon.practice.beans.Account;

@Configuration
public class SpringConfig
{

	@Bean("acc1")
	public Account createAccount()
	{
		Account account = new Account();

		account.setAccHolderName("Shakir");
		account.setIfsscCode("SBIN76543");
		account.setAccNumber("987654333");
		return account;
	}
}

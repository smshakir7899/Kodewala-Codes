package com.amazon.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.practice.beans.Account;
import com.amazon.practice.beans.Payment;
import com.amazon.practice.config.AppConfig;
import com.amazon.practice.config.SpringConfig;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Account account = (Account) context.getBean("acc1");
		account.getAccountDetails();

		ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
		Payment pay = (Payment) context1.getBean(Payment.class);
		pay.showPaymentDetails();
	}
}

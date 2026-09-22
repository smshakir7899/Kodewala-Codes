package com.amazon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.account.beans.Account;
import com.amazon.account.beans.Payment;
import com.amazon.account.config.AppConfig;
import com.amazon.account.config.SpringConfig;

public class App
{
	public static void main(String[] args)
	{
		// Using Bean created with JavaType
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Account account = (Account) context.getBean("acc1");
		account.getAccountDetails();

		// Using bean created with Annotation
		ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
		Payment pay = (Payment) context2.getBean(Payment.class);
		pay.showPayment();
	}
}

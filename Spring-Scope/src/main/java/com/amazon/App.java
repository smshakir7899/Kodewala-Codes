package com.amazon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.beans.Payment;
import com.amazon.config.SpringConfig;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Payment payment1 = (Payment) context.getBean("pay1");
		Payment payment2 = (Payment) context.getBean("pay1");
		payment1.showPaymentDetails();
		System.out.println(payment1 == payment2);
		// here if the scope is singleton it will return true as only one object is created and all are working on same bean.
		// if we changed the scope to prototype then it will return false as different objects as every time new bean will be created 
		
		
		
		
	}
}

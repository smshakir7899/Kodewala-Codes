package com.amazon.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amazon.user.beans.Customer;
import com.amazon.user.beans.Order;
import com.amazon.user.beans.Product;

public class App
{
	public static void main(String[] args)
	{
		String configPath = "beans.xml";

		ApplicationContext context = new ClassPathXmlApplicationContext(configPath);
		Customer customer = (Customer) context.getBean("customer1");
		customer.displayCustomerDetails();

		Product product = (Product) context.getBean("product1");
		product.displayProductDetails();

		Order order = (Order) context.getBean("order1");
		order.displayOrderDetails();
	}
}

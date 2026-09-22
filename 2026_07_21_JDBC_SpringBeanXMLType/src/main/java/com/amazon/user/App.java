package com.amazon.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amazon.user.beans.User;

public class App
{
	public static void main(String[] args)
	{
		String configFile = "com/amazon/user/beans.xml";

		// Creating an IOC container
		ApplicationContext context = new ClassPathXmlApplicationContext(configFile);

		// Request for bean
		User user = (User) context.getBean("user1");

		user.setName("Shakir");
		user.setBatch("March Batch");
		user.setLocation("BTM");

		// Using the bean
		user.displayUserDetails();

	}
}

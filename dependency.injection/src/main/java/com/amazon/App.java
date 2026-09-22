package com.amazon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.config.SpringConfig;
import com.amazon.di.constructor.emp.Employee;
import com.amazon.di.setter.emp.Employee1;

public class App
{
	public static void main(String[] args)
	{
		/*
		 * ApplicationContext context = new
		 * AnnotationConfigApplicationContext(SpringConfig.class);
		 * 
		 * Employee e1 = (Employee) context.getBean("emp1"); e1.getEmployeeDetails();
		 */

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Employee1 e2 = (Employee1) context.getBean("emp2");
		e2.getEmployeeDetails();
	}
}

package com.amazon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazon.di.constructor.address.Address;
import com.amazon.di.constructor.emp.Employee;
import com.amazon.di.setter.address.Address1;
import com.amazon.di.setter.emp.Employee1;

@Configuration
public class SpringConfig
{

	@Bean
	public Address address()
	{
		Address address = new Address("Galaxy Service Centre", "14th Cross Road", "Bengaluru", "Karnataka");
		return address;
	}

	@Bean("emp1")
	public Employee employee(Address address)
	{
		Employee employee = new Employee("Sayyed", 12345653, address); // address is mandatory
		return employee;
	}

	@Bean
	public Address1 address1()
	{
		Address1 address1 = new Address1("Galaxy Service Centre", "14th Cross Road", "Bengaluru", "Karnataka");
		return address1;
	}

	// commending it to understand auto wired
//	@Bean("emp2")
//	public Employee1 employee1(Address1 address1)
//	{
//		Employee1 employee1 = new Employee1("Shakir", 9876543);
//		employee1.setAddress1(address1); // now it is optional not mandatory
//		// even if you can remove or commend the program will run
//		return employee1;

	@Bean("emp2")
	public Employee1 employee1(Address1 address1)
	{
		Employee1 employee1 = new Employee1("Shakir", 9876543);
		return employee1;
	}

}

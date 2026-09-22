package com.amazon.di.setter.emp;

import org.springframework.beans.factory.annotation.Autowired;

import com.amazon.di.setter.address.Address1;

public class Employee1
{

	private String name;
	private int salary;

	@Autowired
	private Address1 address1;

	// we are passing dependency using setter (mutable as we can change it any
	// time)
	public Employee1(String name, int salary)
	{
		super();
		this.name = name;
		this.salary = salary;
	}

	// i am commending this to understand auto wire
//	public void setAddress1(Address1 address1)
//	{
//		this.address1 = address1;
//	}

	public void getEmployeeDetails()
	{
		address1.displayAddressInfo();
	}

}

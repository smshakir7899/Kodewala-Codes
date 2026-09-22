package com.amazon.di.constructor.emp;

import com.amazon.di.constructor.address.Address;

public class Employee
{

	private String name;
	private int salary;

	private final Address address;

	// we are passing dependency using constructor (immutable)
	public Employee(String name, int salary, Address address)
	{
		super();
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public void getEmployeeDetails()
	{
		address.displayAddressInfo();
	}

}

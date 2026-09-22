package com.amazon.user.beans;

public class User
{

	String name;
	String batch;
	String location;

	public void displayUserDetails()
	{
		System.out.println("User [name=" + name + ", batch=" + batch + ", location=" + location + "]");
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getBatch()
	{
		return batch;
	}

	public void setBatch(String batch)
	{
		this.batch = batch;
	}

	public String getLocation()
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	@Override
	public String toString()
	{
		return "User [name=" + name + ", batch=" + batch + ", location=" + location + "]";
	}

}



package com.kodewala.object6;


class VehicleInfo
{
	public VehicleInfo(String state)
	{
		System.out.println("Vehicle Registered State: "+state);
	}
}

class Car extends VehicleInfo
{
	String model;
	String color;
	int price;
	String company;
	
	Car(String model, String color, int price)
	{
		this(model, color, price, "Toyota");
	}
	
	Car(String model, String color, int price, String company)
	{
		super("Karnataka");
		
		this.model = model;
		this.color = color;
		this.price = price;
		this.company = company;
	}
	
	void display()
	{
		System.out.println("Model Name: "+model);
		System.out.println("Model Color: "+color);
		System.out.println("Model Price: "+price);
		System.out.println("Company: "+company);
	}
}

public class Driver
{

	public static void main(String[] args)
	{
		Car car1 = new Car("Fortuner", "Black", 4900000);
		
		car1.display();
	}

}

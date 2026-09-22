package com.amazon.user.beans;

public class Product
{
	String productId;
	String productName;
	int price;

	public void displayProductDetails()
	{
		System.out.println("Product Details..............");
		System.out.println("ID: " + productId);
		System.out.println("Name: " + productName);
		System.out.println("Price: " + price);
		System.out.println(".............................");
		System.out.println();
	}

	public String getProductId()
	{
		return productId;
	}

	public void setProductId(String productId)
	{
		this.productId = productId;
	}

	public String getProductName()
	{
		return productName;
	}

	public void setProductName(String productName)
	{
		this.productName = productName;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

}

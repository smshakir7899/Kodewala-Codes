package com.zepto.category.product.request.response;

public class ProductRequest
{

	private String name;
	private String description;
	private Double price;
	private String categoryId;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public Double getPrice()
	{
		return price;
	}

	public void setPrice(Double price)
	{
		this.price = price;
	}

	public String getCategoryId()
	{
		return categoryId;
	}

	public void setCategoryId(String categoryId)
	{
		this.categoryId = categoryId;
	}

	@Override
	public String toString()
	{
		return "ProductRequest [name=" + name + ", description=" + description + ", price=" + price + ", categoryId="
				+ categoryId + "]";
	}
	

}
package com.flipkart.customer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "product-category")
public interface ProductCategoryClient
{

	@GetMapping("/category/showCategories")
	String getCategories();
}
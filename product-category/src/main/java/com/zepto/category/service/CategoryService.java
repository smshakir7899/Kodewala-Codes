package com.zepto.category.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.category.entity.CategoryEntity;
import com.zepto.category.entity.CategoryRequest;
import com.zepto.category.entity.response.CategoryResponse;
import com.zepto.category.product.entity.ProductEntity;
import com.zepto.category.repository.CategoryRepository;

@Service
public class CategoryService
{

	@Autowired
	CategoryRepository categoryRepository;

	// total 4 queries ---> N categories ---> 1+N
	public void showAllCategories()
	{
		System.out.println("CategoryService.showAllCategories():::::::::::::::::::::::::START");

		// This fired one query to get all the categories
		// Iterable<CategoryEntity> categories = categoryRepository.findAll();
		List<CategoryEntity> categories = categoryRepository.getAllCategories();

		for (CategoryEntity categoryEntity : categories)
		{
			System.out.println(categoryEntity.getName());
			System.out.println(categoryEntity.getId());

			// one query per category (Here total 3 category)
			List<ProductEntity> products = categoryEntity.getProducts();
			System.out.println("Total products are: " + products);
		}
		System.out.println("CategoryService.showAllCategories()::::::::::::::::::::::::::::END");
	}

	public CategoryResponse createCategory(CategoryRequest categoryRequest)
	{
		CategoryEntity categoryEntity = new CategoryEntity();
		categoryEntity.setName(categoryRequest.getName());
		categoryEntity.setDescription(categoryRequest.getDescription());
		categoryEntity.setStatus("Active");
		CategoryEntity responseEntiry = categoryRepository.save(categoryEntity);

		CategoryResponse categoryResponse = new CategoryResponse();
		categoryResponse.setId(responseEntiry.getId());
		categoryResponse.setName(responseEntiry.getName());
		categoryResponse.setDescription(responseEntiry.getDescription());
		categoryResponse.setStatus(responseEntiry.getStatus());

		return categoryResponse;
	}
}

package com.demo.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.products.dao.Products;
import com.demo.products.service.ProductsService;

@RestController
public class ProductsController {
	
	@Autowired
	private ProductsService productsService;
	
	@GetMapping(path = "products")
	public List<Products> getAllProducts() {
		return productsService.getProducts();
	}

}

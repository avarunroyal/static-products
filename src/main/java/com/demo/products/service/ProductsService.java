package com.demo.products.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.products.dao.Products;

@Service
public class ProductsService {

	public List<Products> getProducts() {
		List<Products> productsList = new ArrayList<>();
		Products product = new Products();
		product.setProductName("Chair");
		product.setPrice("2300");
		productsList.add(product);
		return productsList;

	}

}

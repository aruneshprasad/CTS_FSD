package com.cts.service;

import org.springframework.stereotype.Service;

import com.cts.entity.Product;

@Service("prodService")
public class ProductService {
	
	public Product saveProduct() {
		Product prod = new Product();
		
		prod.setId("P001");
		prod.setName("Pen");
		prod.setPrice(56.25);
		
		return prod;
	}

}

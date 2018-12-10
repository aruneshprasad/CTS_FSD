package com.cts.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entities.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao prodDao;

	@Override
	public List<Product> findAll() {
		return prodDao.findAll();
	}

	@Override
	public Optional<Product> findById(String prodId) {
		return prodDao.findById(prodId);
	}

	@Override
	public void deleteById(String prodId) {
		prodDao.deleteById(prodId);
	}

	@Override
	public Product save(Product product) {
		return prodDao.save(product);
	}
	
	
	

}

package com.product.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.product.dao.ProductDao;
import com.product.entity.Product;

@Service("prodService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean saveProduct(Product product) {
		return prodDao.saveProduct(product);
	}

	@Override
	@Transactional
	public Product findProduct(String prodId) {
		return prodDao.findProduct(prodId);
	}

	@Override
	@Transactional
	public List<Product> listAll() {
		return prodDao.listAll();
	}

	@Override
	@Transactional
	public boolean updateProduct(Product product) {
		prodDao.updateProduct(product);
		return true;
	}

	@Override
	@Transactional
	public boolean deleteProduct(String prodId) {
		return prodDao.deleteProduct(prodId);
	}

}

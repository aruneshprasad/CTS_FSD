package com.cts.product.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.entities.Product;
import com.cts.product.service.ProductService;

@RestController
@CrossOrigin
@ComponentScans(value= {@ComponentScan("com.cts.product.service"), @ComponentScan("com.cts.product.dao")})
@RequestMapping(value="/products")
public class ProductController {
	
	@Autowired
	private ProductService ps;
	List<Product> products = null;
	Optional<Product> product=null;
	
	@GetMapping(value = "/")
	public ResponseEntity<?> listAll() {
		products = ps.findAll();
		if (products.isEmpty()) {
			return new ResponseEntity<String>("No Records available in DB", HttpStatus.OK);
		}

		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}

	@PostMapping(value = "/product/")
	public ResponseEntity<?> saveProduct(@RequestBody Product product) {
		product=ps.save(product);
		
		if(product==null) {
			return new ResponseEntity<String>("Product not saved", HttpStatus.OK);

		}
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}

}

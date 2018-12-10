package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.product.config.ApplicationConfig;
import com.product.entity.Product;
import com.product.service.ProductService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		ProductService ps = ac.getBean("prodService", ProductService.class);

		/*-------------- Saving -----------------*/
		/*Product prod = new Product();
		prod.setProdId("P002");
		prod.setProdName("Pen");
		prod.setPrice(20.85);
		ps.saveProduct(prod);*/
		
		/*------------ Find All ------------------*/
		/*for(Product p:ps.listAll()) {
			System.out.println("Id: "+p.getProdId());
			System.out.println("Name: "+p.getProdName());
			System.out.println("Price: "+p.getPrice());
			System.out.println("-------------------------");
		}*/
		
		/*-------------- Find One -------------------*/
		/*Product prod = ps.findProduct("P001");
		System.out.println("Id: "+ prod.getProdId());
		System.out.println("Name: "+ prod.getProdName());
		System.out.println("Price: "+ prod.getPrice());*/
		
		/*----------------- Update Product -----------*/
		/*Product prod = new Product();
		prod.setProdId("P002");
		prod.setProdName("Red Pen");
		prod.setPrice(45);
		ps.updateProduct(prod);*/
		
		/*----------------- Delete Product---------*/
		boolean status = ps.deleteProduct("P001");
		

	

	}

}

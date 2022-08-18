package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.service.ProductService;

//@Controller				// if we want jsp as a view we have to take controller 
@RestController				// any other technologies can call like python, asp.net, angular, react js
@RequestMapping("product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	// http://localhost:8080/product/allProduct 
	
	@GetMapping(value = "allProduct",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProduct() {
		return productService.findAllProduct();
	}
	
	// http://localhost:8080/product/storeProduct -- pass data in json format. 
	@PostMapping(value = "storeProduct",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProduct(@RequestBody Product product) {
		return productService.storeProduct(product);
	}
	
}

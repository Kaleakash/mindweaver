package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	
	public List<Product> findAllProduct() {
		return productRepository.findAll();
	}
	
	public String storeProduct(Product product) {
		Optional<Product>	op	= productRepository.findById(product.getPid());
		if(op.isPresent()) {
				return "product pid must be unique";
		}else {
			productRepository.save(product);
			return "product details stored successfully";
		}
	}
}

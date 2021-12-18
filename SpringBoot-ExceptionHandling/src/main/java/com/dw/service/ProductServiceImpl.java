package com.dw.service;

import org.springframework.stereotype.Service;

import com.dw.exception.NoProductFoundException;
import com.dw.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public Product findByProductId(Integer id) {
		if (id == 101) {
			return new Product(101, "Mouse", "10000");
		} else {
			throw new NoProductFoundException("Product Not Found Exception");
		}
	}
}

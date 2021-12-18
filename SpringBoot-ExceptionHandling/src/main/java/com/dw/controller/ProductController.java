package com.dw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dw.model.Product;
import com.dw.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	// http://localhost:8080/getProduct?pid=101

	@GetMapping(value = "/getProduct", produces = { "application/json" })
	public Product getProductDataById(@RequestParam("pid") String pid) {
		return productService.findByProductId(Integer.parseInt(pid));
	}
}

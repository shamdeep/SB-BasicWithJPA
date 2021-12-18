package com.dw.beans;

import java.util.List;

import com.dw.model.Product;

public interface IDataFilter {

	public List<Product> filterProducts(List<Product> productList);

}

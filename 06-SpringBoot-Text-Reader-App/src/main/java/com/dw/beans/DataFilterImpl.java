package com.dw.beans;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.dw.model.Product;

@Service
public class DataFilterImpl implements IDataFilter {

	@Override
	public List<Product> filterProducts(List<Product> productList) {

		//legacy approach
		/*for (Product product : productList) {
			if (product.getProductId() >= 5000.00) {
				productList.add(product);
			}
		}*/
		
		return productList.stream().
						   filter(p -> p.getProductPrice() >= 5000.00)
						   .collect(Collectors.toList());
	}

}

package com.dw.beans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dw.model.Product;

@Service
public class CsvReader {

	// @Autowired
	private IDataFilter dataFilter;

	// COnstructor injection
	public CsvReader(IDataFilter dataFilter) {
		this.dataFilter = dataFilter;
	}

	public List<Product> readAndFilterProductData() throws Exception {

		List<Product> pList = new ArrayList<Product>();

		FileReader fileReader = new FileReader("product.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String lineData = bufferedReader.readLine();

		while (lineData != null) {
			String[] split = lineData.split(",");
			String pid = split[0];
			String name = split[1];
			String price = split[2];

			Product product = new Product();
			product.setProductId(Integer.parseInt(pid));
			product.setProductName(name);
			product.setProductPrice(Double.parseDouble(price));

			pList.add(product);

			lineData = bufferedReader.readLine();

		}
		
		bufferedReader.close();
		
		return dataFilter.filterProducts(pList);
	}
}

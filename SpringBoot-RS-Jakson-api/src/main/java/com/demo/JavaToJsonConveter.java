package com.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConveter {

	public static void main(String[] args) throws JsonProcessingException {

		Book book = new Book(101, "Java", 800.00);
		
		// Convert Book Data into Json
		ObjectMapper mapper =  new ObjectMapper();
		String json =  mapper.writerWithDefaultPrettyPrinter()
				             .writeValueAsString(book);
		System.out.println(json);
	}
}

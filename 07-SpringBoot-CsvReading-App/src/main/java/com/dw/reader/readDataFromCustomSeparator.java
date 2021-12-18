package com.dw.reader;

import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class readDataFromCustomSeparator {
public static void main(String[] args) {
	
	try {
        // Create an object of file reader class with CSV file as a parameter.
        FileReader filereader = new FileReader("product.csv");
 
        // create csvParser object with
        // custom separator semi-colon
        CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
 
        // create csvReader object with parameter
        // filereader and parser
        CSVReader csvReader = new CSVReaderBuilder(filereader)
                                  .withCSVParser(parser)
                                  .build();
 
        // Read all data at once
        List<String[]> allData = csvReader.readAll();
 
        // Print Data.
        for (String[] row : allData) {
            for (String cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
    catch (Exception e) {
        e.printStackTrace();
    }
}
}

package com.csv.annotation;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class OpenCsvWrite {
	public static void main(String[] args) throws IOException {

		List<String[]> csvData = createCsvDataSimple();

		try (CSVWriter writer = new CSVWriter(new FileWriter("D:\\OpenCsv\\OpenCsvWrite.csv"))) {
			writer.writeAll(csvData);
		}
	}

	private static List<String[]> createCsvDataSimple() {
		String[] header = {"Fname", "Lname", "City", "State", "phone"};
		String[] line1 = {"Pappu", "Kumar", "Khanjharpur", "Bihar", "8871312779"};
		String[] line2 = {"Aryan", "Thakur", " Darbhanga", "Mp", "7564082244"};

		List<String[]> list = new ArrayList<>();
		list.add(header);
		list.add(line1);
		list.add(line2);
		System.out.println("Welcome to Csv file");
		return list;
	}
}

package com.csv.annotation;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class WriteToCSV {
	public static void main(String args[]) throws Exception {
	    
	      CSVWriter writer = new CSVWriter(new FileWriter("D:\\path\\Output.csv"));

	      List<String[]> list = new ArrayList<String[]>();
	      String header[] = {"fname", "lname", "city", "State"};
	      String line2[] = {"Krishna", "Thakur", "darbhanga", "Bihar"};
	      String line3[] = {"Vishnu", "Jha", "patna", "Bihar"};
	      String line4[] = {"Raja", "Kumar", "jhanjharpur", "MP"};
	      String line5[] = {"Raghav", "Singh",  "madhubani", "UP"};
	      
	      list.add(header);
	      list.add(line2);
	      list.add(line3);
	      list.add(line4);
	      list.add(line5);
	    
	      writer.writeAll(list);
	      writer.flush();
	      System.out.println("Data entered");
	   }
}

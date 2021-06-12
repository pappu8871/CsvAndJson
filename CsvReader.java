package com.csv.annotation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {
	public static void main(String[] args){

		String path = "D:\\ReadCSV\\Read.csv";
		String line = " ";
		{
			try 
			{
				BufferedReader bReader = new BufferedReader(new FileReader(path));

				while((line = bReader.readLine()) != null) {
					System.out.println(line);
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		}
}

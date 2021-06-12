package com.json;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.InputStream;
	import java.util.List;

	import com.fasterxml.jackson.core.JsonParseException;
	import com.fasterxml.jackson.core.type.TypeReference;
	import com.fasterxml.jackson.databind.JsonMappingException;
	import com.fasterxml.jackson.databind.ObjectMapper;

	public class WriteJson {
	  public static void main(String[] args)  {
		  
		  try {
			ObjectMapper mapper = new ObjectMapper();
			InputStream inputStream = new FileInputStream(new File("D:\\Json\\test1.json"));

			//To write data
			Person person = new Person();
			person.setFirstName("Aahan");
			person.setLastName("kumar");
			person.setAge(22);
			person.setAddress(new Address("Dbg", "Bihar", 847403, "8871312779", "pappu8871@gmail.com"));
			person.setDetails("This is My Details");
			mapper.writeValue(new File("D:\\Json\\test1.json  "), person);
			inputStream.close();
			System.out.println("Data is Entered;");
		  	} catch (FileNotFoundException e) {
		  		e.printStackTrace();
		  	} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  	}
	}
	


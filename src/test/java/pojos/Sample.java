package pojos;
//De-serialization
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		FileReader fileReader = new FileReader("C:\\Eclipse Tools\\BrowserLaunch\\SerializationAndDeserialization\\target\\Root.Json");
		ObjectMapper objectMapper= new ObjectMapper();
		Root readValue = objectMapper.readValue(fileReader, Root.class);
		String name = readValue.getName();
		System.out.println(name);
		System.out.println(readValue.getAge());
		System.out.println(readValue.isStatus());
		Address address = readValue.getAddress();
		String city = address.getCity();
		String state = address.getState();
		String country = address.getCountry();
		
		ArrayList<String> courses = readValue.getCourses();
		for (int i=0;i<courses.size();i++) {
			System.out.println(courses.get(i));
			
			
		}
	}

}

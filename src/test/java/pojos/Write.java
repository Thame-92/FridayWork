package pojos;
//Serialization
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Write {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File f=new File("C:\\Eclipse Tools\\BrowserLaunch\\SerializationAndDeserialization\\src\\test\\resources\\Write.Json");
		ObjectMapper objectMapper=new ObjectMapper();
		Address address=new Address("Chennai", "Tamil Nadu", "India");
		ArrayList<String> courses= new ArrayList<String>();
		courses.add("Java");
		courses.add("C++");
		courses.add("Python");
		Root root=new Root("Sivaraj", 33, true, address, courses);
		objectMapper.writeValue(f, root);
	}

}

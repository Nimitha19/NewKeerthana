package Testng_basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;

import org.testng.annotations.Test;

public class Working_with_Propertyfile {
	
	@Test
	public void propertydemo() throws IOException {
		
		String filepath="./Test_configuration./Test_configuration_properties";
		FileInputStream fis=new FileInputStream(filepath);
		
		//creatr objectbfor properties class
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.get("Firstname"));
		System.out.println(prop.get("Lastname"));
		System.out.println(prop.get("URL"));
	}
}

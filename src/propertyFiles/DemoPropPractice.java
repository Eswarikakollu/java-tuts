package propertyFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class DemoPropPractice {
	
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		
		properties.setProperty("id", "531");
		properties.setProperty("name", "raji");
		properties.setProperty("login", "raazi");
		
		
		String filepath = System.getProperty("user.dir")+"//data//example2.properties";
		
		FileOutputStream fos = new FileOutputStream(filepath);
		
		
		properties.store(fos, "practical data stored in the properties file");
		System.out.println("Properties fiel created in this path" +filepath);
		System.out.println("Data in the properties file is::");
		System.out.println(properties.get("name"));
		
		FileInputStream fis = new FileInputStream(filepath);
		
		properties.load(fis);
		
		//ikkadiki emavtundante data anedi properties object loki load ayiuntundi akkadinundi manam difefrentways lo ready cheskivachu
		properties.getProperty("id");
		
		System.out.println();
		
		
		//if i want to retrive only keys (all the properties without values

          Set<String> keys =  properties.stringPropertyNames();
          System.out.println(keys);
          
          //another method to capture ll the properties are ..
          Set<Object> key= properties.keySet();
          System.out.println(key);
          
          
          //both will return the set collection first case will have string format,second case will have object format
          
          
          
          
          
          
          //capture all teh values of teh properties object
         Collection<Object> c=  properties.values();
         System.out.println(c);
          
         
         
         
         //how to read properties along with values
         for(String s: keys)
         {
        	
        	System.out.println(properties.getProperty(s)); 
         }
         
        
          
          
          
  
		
		
		
		
		
		
	}

}

package propertyFiles;
import java.util.Properties;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class WritePropetyFile {
	public static void main(String[] args) throws IOException {
		Properties properties= new Properties();
		
		//property file lo data key value pairs ga untundi.
		
		properties.setProperty("name","raji");
		properties.setProperty("email", "abc@gmail.com");
		properties.setProperty("age", "32");
		
		//ee properties ni  oka file lo pettali.
		
		//String filepath = "C:\\Users\\saiki\\eclipse\\playwright_workspace\\JavaTrainingFullJuly2024\\data";
		
		
//		getProperty() method returns the current project dir.
		String filepath= System.getProperty("user.dir")+"\\data\\examples.properties";
		
		//if we want to write the dtaa to the fiel swe can use FileOutputStream
		
   FileOutputStream fos = new FileOutputStream(filepath);
   properties.store(fos, "sample data in properties files");
		
   
   System.out.println(filepath);
		
		
		
		
		
		
		
	}

}

package com.files;

import java.io.FileWriter;
import java.io.IOException;


public class CsvDemo {
	public static void main(String[] args) throws IOException {
		String csvpath = System.getProperty("user.dir")+"\\data\\example.csv";
		//we arecreating one csv file 
	
		FileWriter writer= new FileWriter(csvpath);
		writer.append("Name,Age,Email \n");//hader
		writer.append("raji,32,abc@gmail.com \n");
		writer.append("john,33,asd@gamil.com \n");
		writer.append("scott,21,wer@gmail.com \n");
		writer.close();
		
		
		System.out.println("CSV File created in yhis path :"+csvpath);
		
		
	}
	

}

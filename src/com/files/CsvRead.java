package com.files;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CsvRead {
	
	public static void main(String[] args) throws IOException {
		
	/*	//we can read data from csv file in 2 ways 
		//1)with scanner class
		//2)
		
	
		String csvpath = "C:\\Users\\saiki\\eclipse\\playwright_workspace\\JavaTrainingFullJuly2024\\data\\example.csv";
		
	
		File f = new File(csvpath);
		
		Scanner sc = new Scanner(f);
		
		sc.useDelimiter(",");
		while(sc.hasNext())
		{
			System.out.print(sc.next() +"\t");
		}
		
		*/
		
		//another way to ready the data from file FileReader
		
		String csvfile = System.getProperty("user.dir")+"\\data\\example.csv";
		FileReader reader = new FileReader(csvfile);
		
		//if u want to read the data line by line use bfr
		BufferedReader bfr = new BufferedReader(reader);
		
		String line=null;
		while((line=bfr.readLine())!=null)
		{
			String[] s = line.split(",");
			for(String s1 :s)
			{
				System.out.print(s1 +"\t");
			}
			System.out.println();
		}
		
		
	}

}

package com.files;
import java.io.*;
import java.util.*;


public class FilesDemo {
	
	
	//creating the files
	public static void createFile(String path)
	{
		File myobj= new File(path);
		
		try{
			if(myobj.createNewFile())
			{
				System.out.println("File created :" +myobj.getName());
			}
			else
				System.out.println("File already exists");
		}
		catch(IOException e1)
		{
			System.out.println(e1.getMessage());
		}
		
		
	}
	
	//writing data to the files 
	
	public static void writeFiles(String path)
	{
		try {
			FileWriter mywriter = new FileWriter(path);
			mywriter.write("welcome to the file one writing data to the file ");
			mywriter.close();
			System.out.println("Data written in the file");
		} catch (IOException e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
		
	}
	
	public static void renameFiles(String oldfilename,String newfilename)
	{
		File fold = new File(oldfilename);
		File fnew = new File(newfilename);
		if(fold.renameTo(fnew))
		{
			System.out.println("File renamed successfulley");
		}
		else
			System.out.println("The file cant be renamed");
	}
	
	public static void readFile(String path) throws FileNotFoundException
	{
		File f = new File(path);
		if(f.exists())
		{
			
			Scanner myreader = new Scanner(f);
			while(myreader.hasNextLine())
			{
			System.out.println(myreader.nextLine());
			}
			
			
			
		}
	}
	
	public static void deleteFile(String path)
	{
		File myobj = new File(path);
		if(myobj.exists())
			{
			myobj.delete();
			System.out.println("File deleted successfully");
			System.out.println(myobj.getName());
			}
		else
			System.out.println("fail to delete the file");
	}
	public static void main(String[] args) throws FileNotFoundException {
		
	String filepath="C:\\Users\\saiki\\Desktop\\pavanfile\\three.txt";
	createFile(filepath);
	
	writeFiles(filepath);
	readFile(filepath);
	String newname="C:\\\\Users\\\\saiki\\\\Desktop\\\\pavanfile\\\\two";
	
	
	//renameFiles(filepath,newname);
	//deleteFile(newname);
	
	
	
	
	
	
	
	}

}

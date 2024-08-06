package com.strings;

public class StringDemo {

	
	public static void main(String[] args) {
		
		
		//s1 and s2 are string literals and store in String constant pool
		String s1="welcome";
		String s2="welcome";
		
		
		//s3 and s4 are string objects created in heap memory as individual objects/
		
		String s3= new String("welcome");
		String s4= new String("welcome").intern();
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		
		
		String str1= "hello";
		String str2= new String("hello").intern();
		
		//intern explicitly refers from heap memory to scp 
		
		System.out.println(str1==str2);
				
		
		//== memory address check chestadi
		//equals() contents of the string same ah kada ani check chetsadi.
	}
}

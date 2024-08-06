package com.strings;

import java.util.Arrays;

public class StringMethodsDemo {
	
	public static void main(String[] args) {
		String s = "welcome";
		//length() used to return the no of characters in string
		System.out.println(s.length());
		
		//charAt(index) method used to read the character in the string at specified index.
		
		//datatype varname = objref.reurntypenonstaticmethod(p1..pn);
		System.out.println(s.charAt(0));
		
		
		//toCharArray() - it converts the string into character array.
		//return type is character array
		
		char[] ch = s.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		
		
		//concatnate 2 strings
		
		String str1="hello";
		String str2 ="Welcome";
		String str3 = null;
		System.out.println(str1.concat(str2));
		
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
		
		System.out.println(str1.isEmpty());
		System.out.println(str1.contains(str2));
		String s6 ="Aa";
		String s7 ="Aa";
		String s8=new String("Aa");
		
		String s9 ="asdfsdljgadkhasg";
		
		
		System.out.println(s7.contains(s6));
		
		
		//equals() - is a overridden method in string class from object class
		//parent class super class for all objects is Object Class.
		
		System.out.println(s6==(s8));
		System.out.println(str1.indexOf("l"));
		
		System.out.println(s9.lastIndexOf("g"));
		
		System.out.println(str1.substring(2));
		System.out.println(str2.substring(2,4));
		
		
		System.out.println(s7.compareTo(s9));
		System.out.println(String.join(s8,s9));
		
		//valueOf() - used to converts the given data to string format
		String s10 = String.valueOf("20");
		System.out.println(s10+5);
		

		
	}

}

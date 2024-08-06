package com.basics;

public class WrapperClassesDemo {
	
	public static void main(String[] args) {
		
		//string -> int
		String s1 = "welcome";
		
		//int i = Integer.parseInt(s1);  //NumberFormatException -cany convert to int as the variable is string
		//System.out.println(i);   
		
		
		String s2 = "12.456";
		String s3 = "123.45";
		double y = (Double.parseDouble(s3)+Double.parseDouble(s2));
		System.out.println(y);
		
		
		
		String s4 ="selenium";//other than true anything it return false.
		
		boolean b = Boolean.parseBoolean(s4);
		System.out.println(!b);
		
		
		int i = 10;
		double d = 12.3;
		float f = 23.45f;
		boolean bool = false;
		
		char c = 'A';
		System.out.println(String.valueOf(c));
		
		String si = String.valueOf(i);
		String sd = String.valueOf(d);
		String sf = String.valueOf(f);
		String sb = String.valueOf(bool);
		System.out.println(si);
				
				
		
		
		
		
	}
	
	

}
  
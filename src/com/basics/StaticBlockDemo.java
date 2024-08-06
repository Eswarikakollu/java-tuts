package com.basics;

public class StaticBlockDemo {
	
	
	static double d ;
	
	static {
		 int a = 20;
		d= a*5;
		System.out.println("value of d in static block is :" +d);
	}
	
	public static void main(String[] args) {
		System.out.println("value of d in main method" +d);
		
		
	}
	
   static {
	   System.out.println("before d value in 2 nd block is :" +d);
	   d = d+10;
	   
	   
	   System.out.println("after  d value second static block:"+ d);
	
	   
   }
}

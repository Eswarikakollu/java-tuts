package com.oopconcepts;

public class MethodOverLodingDemo {
	
	public static int sum(int a ,int b)
	{
		return a+b;
	}
	
	public static double sum(double a ,double b)
	{
		return a+b;
	}

	public static double sum(int a ,double b)
	{
		return a+b;
	}
	
	public static double sum(double a ,int b)
	{
		return a+b;
	}
	
	public static int sum(int a ,int b,int c)
	{
		return a+b+c;
	}
	
	
	
	public static void main(String s)
	{
		System.out.println("This is main method of string type: "+s);
	}
	
	public static void main(int i)
	{
		System.out.println("This is main method of int type: "+i);
	}
	public static void main(String[] args) {
		
		main(100);
		
		System.out.println(sum(1.1,2.1));
		
	}
}

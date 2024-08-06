package com.basics;

public class StaticMembesrDemo {
	
	/*
	 * static variable declaration
	 * accessmodifier static datatype varname = value;
	 * 
	 */
	private static String s = "Java";
	static int i =10;
	protected static float f = 23.f;
	public static long l =34092;
	
	
	/*
	 * write a program to find which number is bigger?
	 * creating static methods 
	 * accessmodidfier static void methodname(){logic;}
	 * 
	 */
	private static void findBiggerNumber()
	{
		
		//local variable syntax
		//datatype varname = value;
		
		byte a =20;
		short b =-30;
		
		if(i>a && i>b) {
			System.out.println(" i is greater value" +i);
		}else if(a>i && a>b)
			System.out.println("a is greater value " +a);
		else if (b>i && b>a)
			System.out.println("b is greater value"+b);
		else System.out.println("provide valid values");
		
	}
	
	/**
	 * write a prg to swap given two number
	 * @param a ,b
	 * 
	 * accessmodifier static returntype methodname(p1,p2){}
	 * 
	 * 
	 */
	
	
	public static void swapOfNumbers(int n1,int n2)
	{
		System.out.println("before swapping n1 and n2 are " +n1 +" "+n2);
	n1=n1+n2;
	n2 = n1-n2;
	n1= n1-n2;
		System.out.println("after swapping n1 and n2 are " +n1 +" "+n2);
	}
	
	
	
	/**
	 * write a prg to return sum of n natural numbers.
	 * @param args
	 * 
	 * accessmodifier static returntype methodname(parameter1){. return;}
	 * 
	 */
	
	static int sunOfNaturalNumber(int n)
	{
		int sum=0;
		int i =1;
		while(i<=n) 
		{
			sum= sum+i;
			i++;
		}
		return sum;
		
	}
	
	
	
	/**
	 * write a program to find random integer number[1=100] 
	 * without parameters and retuntype.
	 * @param args
	 */
	
	protected static int getRandomNumber ()
	{
		int random=0;
		random =(int)(Math.random()*100);
		return random;
		
	}
	
	
	public static void main(String[] args) {
		findBiggerNumber();
		swapOfNumbers(i,(int)f);
		System.out.println(sunOfNaturalNumber(5));
		System.out.println(getRandomNumber());
		
		
		
	}

}

package com.basics;

import java.util.Scanner;

public class LoopsDemo {
	
	/*
	 * write a prg to get the factorial of n numbers using recurssive method
	 * @para n 
	 */
	public int getFactorial(int n)
	{
		if(n==0||n==1)
			return 1;
		else 
			return n*getFactorial(n-1);
		
	}
	
	/*
	 * write a prg to read n numbers from keysborad untill press N
	 */
	
	private void readNumbersSum()
	{
		Scanner sc = new Scanner(System.in);
		int n;
		char loop;
		int sum=0;
		do {
			System.out.println("enter value:");
			n=sc.nextInt();
			sum=sum+n;
			System.out.println("press y to continue n to stop");
			loop=sc.next().charAt(0);
	
			
		} while (loop=='y'||loop=='Y') ;
		
			System.out.println("sum of valus is :" +sum);
		}
		
	
  //accessmodifier static void methodname(){..;}
	
	protected static void printRectangle()
	{
		int rowval=5;
		int colval=4;
		for(int i =0;i<rowval;i++)
		{
          for(int j=0;j<colval;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	//accessmodifier sttaic void methodname(){..logic;}
	public static void breakDemo()
	{
		//once the condition is satisfied break will executes.
		
		for(int i=0;i<10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.print(i +"\t");
		}
		
		System.out.println("outside for loop");
	}
	
	protected static void continueDemo()
	{
		for(int i =1;i<=10;i++)
		{
			if(i%2==0)
			{
				continue;
				
			}
			System.out.println(i +"\t");
		}
	}
	public static void main(String[] args) {
		/*LoopsDemo ldobj = new LoopsDemo();
		System.out.println(ldobj.getFactorial(5));
		ldobj.readNumbersSum();
		*/
		printRectangle();
		breakDemo();
		continueDemo();
		
		
		
	}

}

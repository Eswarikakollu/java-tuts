package com.arrayprograms;

import java.util.Scanner;
public class ArrayVowels {
	
	public void printVowels()
	{
	//datatype[] varnaem = new datatype[size];
	
			final int SIZE=5;
			char[] vowels = new char[SIZE];
			
			
			//read values form console with help of scanner class
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter vowels");
			for(int i =0;i<SIZE;i++)
			{
				vowels[i]=sc.next().charAt(0);
				
				
			}
			
			for(char c : vowels )
			{
				System.out.println(c);
			}
			
			System.out.println("The length of the array is " +vowels.length);
	}
	public static void main(String[] args) {
		
		ArrayVowels avobj = new ArrayVowels();
		avobj.printVowels();
	}

}

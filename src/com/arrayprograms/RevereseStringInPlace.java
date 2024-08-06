package com.arrayprograms;

import java.util.Arrays;

/*
 * The procedure for this prg is 
 * a[] ={1,4,2,5,6}
 * consider the a array and 1,6 are replaced each other and 4 with 5 like wisee
 * 
 * so we need to take length/2 and iterate the data
 * 
 */
public class RevereseStringInPlace {
	
	//accessmodifier static void methodname(parameter1 ..parametern({Plogic..;}
	
	public static void reverseInPlace(int arr[])
	{
		System.out.println("before reversing"+Arrays.toString(arr));
		int temp;
		for(int i =0;i<arr.length/2;i++)
		{
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-i-1]=temp;
			
			
		}
		System.out.println("After reversing"+Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] a =new int[] {1,2,3,5,6};
		reverseInPlace(a);
		
		
	}

}

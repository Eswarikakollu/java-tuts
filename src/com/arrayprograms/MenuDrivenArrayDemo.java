package com.arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class MenuDrivenArrayDemo {
	public static int arr[]= new int[8];
	static Scanner sc = new Scanner(System.in);
	
	public static void readArray()
	{
		System.out.println("Enter values to array:");
		for(int i =0; i<arr.length;i++)
		{
		arr[i]=sc.nextInt();
		}
		System.out.println("entered values are :"+Arrays.toString(arr));

	}
	private static void writeArray()
	{
		System.out.println("values are :" +Arrays.toString(arr));
	}
	
	static void searchArray()
	{
		int search;
		System.out.println("enter element to search");
		search = sc.nextInt();
		boolean flag = false;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				flag = true;
			}
		}
		if(flag ==true )System.out.println("search elemnet is available in array");
		else System.out.println("search element is not available in array");
	}
	
	
	public static void sortArray()
	{
		int temp;
		System.out.println("Before sorting th eelements");
		System.out.println(Arrays.toString(arr));
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					
				}
				
			}
		}
		System.out.println("After sorting the elements");
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int option;
		
		do {
		System.out.println("select the below options ");
		System.out.println("1.Accept /read the elemnts for array from console");
		System.out.println("2.Display the array elements");
		System.out.println("3.search the element in the array");
		System.out.println("4.Sort the array by using bubble sort");
	    option = sc.nextInt();
	    
		switch(option)
		{
		case 1: readArray();
		        break;
		case 2: writeArray();
		        break;
		case 3 :searchArray();
		        break;
		case 4 : sortArray();
		         break;
	
		
		}
		}while(option!=5);
		
	}

}

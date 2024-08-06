package com.arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Array8 {
	
	
	public static void mergeArray(int a[],int b[],int c[])
	{int count=0;
		for(int i =0;i<a.length;i++)
		{
			c[i]=a[i];
			count++;
		}
		for(int j =0;j<b.length;j++)
		{
			c[count]=b[j];
			count++;
		}
		System.out.println(Arrays.toString(c));
		sortArray(c);
	}

	public static void sortArray(int arr[])
	{
		int temp =0;
	
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
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int a[] = new int[5];
		int b[]= new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("write  values to array a");
		for(int i =0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("write  values to array b");
		for(int i =0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
			
		}
		int temp;

		for(int i =0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
				
			}
		}
			
			for(int k =0;k<b.length;k++) {
				for(int j=k+1;j<b.length;j++)
				{
					if(b[k]<b[j])
					{
						temp=b[k];
						b[k]=b[j];
						b[j]=temp;
						
						
					}
					
				}
			}
			
			
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
			
			int c[] = new int[a.length+b.length];
			mergeArray(a,b,c);
			
			
			
	}
}

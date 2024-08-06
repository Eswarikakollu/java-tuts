package com.arrayprograms;

import java.util.Arrays;

public class ArrayRotate {
	public static void leftRotate(int arr[],int n)
	{
		System.out.println(Arrays.toString(arr));
		int temp;
		for(int i =0;i<n;i++)
		{
			temp = arr[0];
			for(int j = 0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
				
			}
			arr[arr.length-1]=temp;
			
		}
		System.out.println("Arrays after rotating " +n +"rounds");
		System.out.println(Arrays.toString(arr));
	}
public static int[] getRan()
{
	final int SIZE=5;
	int ranarray[]= new int[SIZE];
	
	for(int i =0;i<SIZE;i++)
	{
		ranarray[i]= (int)( Math.random()*10);
		
	}
	return ranarray;
	
	
}
	public static void main(String[] args) {
		int a[]= new int[] {1,3,2,4,5};
		leftRotate(a,2);
		int ranArray[] = new int[5];
		ranArray=getRan();
		System.out.println(Arrays.toString(ranArray));
		
	}
}

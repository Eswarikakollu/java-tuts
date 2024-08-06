package com.arrayprograms;

import java.util.Arrays;

public class FindMaxElementArray {
	
	protected static int getMaxElement(int arr[])
	{
		System.out.println("Actual array is :"+Arrays.toString(arr));
		if(arr.length==0)
			throw new IllegalArgumentException("invalid array input");
		
		int max=arr[0];
		for(int i = 0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
				
			}
		}
		return max;
	}
	
	//accessmodifier static void FindDuplicate(datatype p1..datatype pn){..logic;}

protected static void findDuplicate(String fruits[])
{
	boolean flag=false;
	for(int i=0;i<fruits.length;i++)
	{
		for(int j=0;j<fruits.length;j++)
			if(fruits[i].equals(fruits[j]))  //fruits[i].equalsfruits[j]
			{
				System.out.println(fruits[i]);
			}
	}
	if(flag==false)System.out.println("No duplicate items found in the array");
	else System.out.println("duplicate items found in the array");
}
	public static void main(String[] args) {
		
		int a[]= new int[]{1,2,4,2,5};
		System.out.println(getMaxElement(a));
		
		String fruits[] = new String[]{"Blueberry","apple","banana","goa","goa"};
		
		findDuplicate(fruits);
		
		
	}

}

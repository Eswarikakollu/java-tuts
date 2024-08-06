package com.arrayprograms;

import java.util.Arrays;

public class CopyArrayLoop {

	public static void main(String[] args) {
		int a[] = new int[5];
		int dest[] = new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		for(int i =0;i<a.length;i++)
		{
			dest[i]=a[i];
			
		}
		for(int c:dest)
		{
			System.out.print(c +"\t");
		}
		
	System.out.println(Arrays.toString(dest));
	}
}

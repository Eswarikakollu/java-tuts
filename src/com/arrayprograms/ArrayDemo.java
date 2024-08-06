package com.arrayprograms;

public class ArrayDemo {

	public static void main(String[] args) {
		//declaring the array varible
		
		/*datatype[] arrayname = new datatype[size];
		datatype arrayname[] = new datatype[size];
		datatype arrayname[] = new datatype[]{e1,e2,e3..en};
		
		to get the size of the array
		arrayname.lenth;
		
		*/
		
		int[] a = new int[5];
		System.out.println("size of array is :"+a.length);
		
		//initializing values to the array variable .
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		//printing the array variables using forwach loop
		for(int x:a)
		{
			System.out.println(x);
		}
		
	}
}

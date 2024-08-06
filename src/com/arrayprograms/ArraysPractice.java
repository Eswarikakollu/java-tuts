package com.arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {
	
	private  void weeks()
	{
		//datatype varname[] = new datatype[size];
				String daysOfWeek[]= new String[7];
				daysOfWeek[0]="Sunday";
				daysOfWeek[1]="Monday";
				daysOfWeek[2]="Tuesday";
				daysOfWeek[3]="Wednesday";
				daysOfWeek[4]="Thrusday";
				daysOfWeek[5]="Friday";
				daysOfWeek[6]="Saturday";
				
				System.out.println(daysOfWeek.length);
				for(String s : daysOfWeek)
				{
					System.out.println(s);
				}
			
	}
	
	public static void readInput()
	{
		Scanner sc = new Scanner(System.in);
		int[] a= new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]= sc.nextInt();
		}
		
		System.out.println(Arrays.toString(a));
	}
	
	protected static void  copyArray()
	{
		char list1[]=new char[5];
		char list2[]= new char[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<list1.length;i++)
		{
			list1[i]= sc.next().charAt(0);
			list2[i]=list1[i];
		}
		System.out.println(Arrays.toString(list1));
		
		
	}
	
	
	static void singleDArray()
	{
		float f[]= new float[]{1.2f,2.3f,3.4f,4.5f,5.6f};
		
		float rev[]= new float[f.length];
		int index=0;
		for(int i =f.length-1;i>=0;i--)
		{
			rev[index]=f[i];
			index++;
		}
		System.out.println(Arrays.toString(f));
		System.out.println(Arrays.toString(rev));
	}
	
	public static void bigAndSmall()
	{
		Scanner sc = new Scanner(System.in);
		int array[]= new int[5];
		for(int i = 0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
			
		}
		
		int min=0;
		int max =0;
		
		
		for(int i =0;i<array.length;i++)
		{
			if(max<array[i])
			{
				max= array[i];
				
			}
			else if(min>array[i])
			{
				min=array[i];
				
			}
		}
		System.out.println("minimum value is :"+min);
		System.out.println("maximun value is :"+max);
	}
	public static void main(String[] args) {
		
		//readInput();
		//copyArray();
		//singleDArray();
		bigAndSmall();
		
		
		
		
		
}
}
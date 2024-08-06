package com.arrayprograms;

public class InterviewPrograms {
	
	
	public static void printChar(int n)
	{
		int temp;
		
		for(int i =0;i<n;i++)
		{
			temp=i;
			for(int j =0;j<n;j++)
			{
				if(i==j)
					System.out.print('*' +"\t");
				if(i<=j)
					System.out.print("*"+"\t");
				else System.out.print("." +"\t");
				
			}
			System.out.println();
		}
	}
	
	/**
	 * right angle triangle
	 * @param args
	 */
	
	private static void rightTri(int n)
	{
		for(int i =0;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*" +"\t");
			}
			System.out.println();
	}
	}
	
	
	/*
	 * print pyramid
	 */
	
	protected static void pyramid(int n)
	{
		
	}
	public static void main(String[] args) {
		printChar(5);
		rightTri(5);
		
		
	}

}

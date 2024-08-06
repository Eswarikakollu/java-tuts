package com.basics;

public class WhileLoopDemo {
	public static void main(String[] args) {
		
		
		int i =10;
		while(i>=0)
		{
			System.out.println(i);
			i--;
		}
		
		System.out.println("*****************************");
		while(i<=20) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("*************************");
		
		int k =1;
		do {
			if(k==5) continue;
			System.out.println(k);
		
			k++;
		}while(k<10);
	}

}

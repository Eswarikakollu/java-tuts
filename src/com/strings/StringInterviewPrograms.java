package com.strings;

import java.util.Arrays;

public class StringInterviewPrograms {
	
	public static void reverseString(String s)
	{
		System.out.println("before reverse"+s);
		String revval="" ;
		for(int i=s.length()-1;i>=0;i--)
		{
			revval=revval+s.charAt(i);
			
			
		}
		System.out.println("after revrese::" +revval);
	}
	
	
	public static void reverseStrin(String s)
	{
		String rev ="";
		for(int i=0;i<s.length();i++)
		{
			rev = s.charAt(i)+rev;
			
		}
		System.out.println(rev);
	}
	
	private static void isPalindrome(String s) {
		boolean isPali=true;
		for(int i =0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
			{
				isPali=false;
				
			}
		}
		if(isPali==false)
			System.out.println("not a palindrome");
		else
		System.out.println("palindrome number");
	}
	
	
	protected static void vowelsConsonents(String s)
	{
		s=s.toLowerCase();
		int vcount=0;
		int ccount=0;
		int ncount=0;
		int spclcharcount=0;
		
		for(int i =0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				vcount++;
			else if(s.charAt(i)>='a'&& s.charAt(i) <='z')
				ccount++;
			else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
				ncount++;
			else spclcharcount++;
			
		}

System.out.println(vcount);
System.out.println(ccount);
System.out.println(ncount);
System.out.println(spclcharcount);

	}
	
	
	/*write a program to find to check given two strings are anagroms (or)not.
	 * two string have numbers of same characters in different fromat
	 * 
	 * Step1: convert the 2 arrays to lower cases
	 * step2 : check both teh arrays lengths are same or not
	 * step3: if yes  convert the strings to chracter arrays by using toCharArray()
	 * Step4: sort the character array using Arrays.sort()
	 * step5: compare the arrays*/
	
	
	
	private static void checkAnagroms(String str1,String str2)
	{
		String s1 = str1.toLowerCase();
		String s2 = str2.toLowerCase();
		if(s1.length()==s2.length())
		{
			
			char sone[] = s1.toCharArray();
			char stwo[]= s2.toCharArray();
			
			
			Arrays.sort(sone);
			Arrays.sort(stwo);
			
			if(Arrays.equals(sone, stwo))
			{
				System.out.println("Both the strings are anagrams");
			}
			else 
				System.out.println("not anagrams");
			
			}
		
		
	}
	 
	public static void main(String[] args) {
		//reverseString("java");
		//reverseStrin("selenium");
		//isPalindrome("popo");
		
		//vowelsConsonents("jdhgasgtpoweur9129480238yrhfdslknc@!#$%^Y");
		
		checkAnagroms("hello","aello");
		
	}

}

package com.basics;

import java.util.Scanner;

public class NonStaticMembersDemo {

	/*
	 * accessspecifier datatype varname =values;
	 * 
	 */
	
	private char c ='A';
	float f =2.8f;
	protected double d = 90.0d;
	public int i =10;
	
	//now i will create 4 nonstatic methods 2 are of void n 2 are of returntype
	
	//accessmodifier void methodname(){..}
	//acccessmodifier void methodname(p1,p2..pn){..}
	//accessmodifier int methodname(){..}
	//accessmodifier int methodname(p1..pn){..}
	
	
	
	
	/*accessmodifier void methodname(){..}
	 * caliculator program
	 */
	
	public void caliculator()
	{
          Scanner sc = new Scanner(System.in);
		
		double n1,n2,result=0;
		char operator;
		System.out.println("enter n1 value");
		n1=sc.nextDouble();
		System.out.println("enter n2 value");
		n2 = sc.nextDouble();
		
		/*
		 * String s="Java"; (string is character array,to access individual character we use 
		 * charAt(int index) method ,it will return the character.
		 * 
		 * nextInt() returns the string type from that we are accessing the first character at index 0
		 * 
		 *           
		 */
		System.out.println("enter operator value");
		operator = sc.next().charAt(0);
		switch(operator)
		{
		case '+':
			 result = n1+n2;
			 break;
		case '-':
			 result = n1-n2;
			 break;
		case '*':
			 result = n1*n2;
			 break;
		case '/':
			 result = n1/n2;
			 break;
		case '%':
			 result = n1/n2;
			 break;
		default:
			System.out.println("please enter valid operator");
		 
		}
		
		System.out.println(result );
	}
	
	
	/*
	 * create a parameteraized non-static method to swap two given integers using 3rd var
	 * @args n1 n2
	 * accessmodifier void methodname(datatype p1,datatype p2..datatype pn)
	 */
	
	public void swapOfTwoNumbers(int x,int y)
	{
		System.out.println("x and y values before swapping is :"+x +" " +y);
		int temp ;temp=x;x=y;y=temp;
		System.out.println("x and y values after swapping is :"+x +" " +y);
	}
	
	
	
	/*
	 * write aprogram to get the factorial valu of given n
	 * accessmodifier datatype methodname(parameter p1..datatypen; return res;}
	 */
	
	int factorial(int n)
	{
		
		if(n==0||n==1)
			return 1;
		else 
		
		return n*factorial(n-1);
	}
	
	
	/*
	 * write a program to find the difference of even and odd numbers sum
	 * accessmodifier returntype methodname(datatype p1...datatype pn){logic;return value;}
	 */
	
	protected int differencOfEvenOddSum(int n)
	{	int evensum=0,oddsum=0;
	for(int i =1;i<=n;i++)
	{
		if(i%2==0)
		{evensum = evensum+i;
		}
		else oddsum = oddsum+i;
		
	}
	System.out.println("even sum is :"+evensum);
	System.out.println("odd sum is :"+oddsum);
	return evensum-oddsum;
	
	}
	public static void main(String[] args) {
		
		/*
		 * how can we called the non-sttaic method in static method
		 * by creating the object
		 * classname refvar = new classname();
		 * refvar.nonstaticmethodname();
		 */
		NonStaticMembersDemo nd = new NonStaticMembersDemo();
		nd.caliculator();
		
		/*
		 * how call parameterraised non-static method 
		 * objerev.methodname(datatype p1,datatype p2..datatype pn);
		 */
		nd.swapOfTwoNumbers(10, 20);
		
		/*
		 * how to call nonstatic parametaraised returntype method
		 * returntypedatatype varname =objeref.methodname(datatyoe p1..datatype pn);
		 * 
		 */
		int getFact = nd.factorial(5);
		System.out.println("factorial value is "+getFact);
		
		/*
		 * how call the nonstatic return type method withparameters in static method
		 * returntypedataype value = objeref.methodname(datatypep1,datatypep2..datatype pn)
		 */
		int difference=nd.differencOfEvenOddSum(20);System.out.println("evenodd difference is :"+difference);
		
		
		long varres = (long)(nd.f+nd.d+nd.i+nd.c);
		System.out.println("nonstatic variables called in static method"+varres);
		
		
	}
	
}


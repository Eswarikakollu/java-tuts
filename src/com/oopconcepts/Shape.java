package com.oopconcepts;

public interface Shape {
	
	int length=10;  //be default static  ,final & public 
	int width=20;   //**classs lo accessspecifier mention cheyakapote default but interface lo adi public.
	
	default void square()  //interface lo abstract,static,default methods untayi.
	 //as emi mention cheyaledu kabatti error choopictsundi 
	 //abstract ani iste aa methid ki definition ivvakudadu
	 //else dfault /static ani ivvali.
	{
		System.out.println("This is square default method");
	}
	
	
	
	static void rectangle()
	{
		System.out.println("This is rectangle static method");
	}
	
	//returntype methodname();  abstarct method synstax
	
	 void circle();
}

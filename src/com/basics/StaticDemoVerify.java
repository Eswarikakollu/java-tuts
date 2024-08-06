package com.basics;

public class StaticDemoVerify {

	public static void main(String[] args) {
		StaticDemo sd = new StaticDemo();
		sd.m4();sd.m1();
		//sd.m2();//scope is not visible to another classes in the same package 
		
		System.out.println(sd.a +" " +sd.c);
		System.out.println(sd.fval);
		//System.out.println(sd.d); --d value is not visible 
	}
}


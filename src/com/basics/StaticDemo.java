package com.basics;

public class StaticDemo {
	
	//accessmodifier static void methodname(){methodbody}
	
	public static void m1() {
		System.out.println("Method in static demo class with public accessmodifier");
	}
	
	private static void m2() {
		System.out.println("Method in static demo class with private accessmodifier");
	}
	
	protected static void m3() {
		System.out.println("Method in static demo class with protected accessmodifier");
	}
	
	static void m4() {
		System.out.println("Method in static demo class with package/default accessmodifier");
	}
	
	
	
	
	//accessmodifier static datatype varname = value;
	
	public static int a =20;
	private static double d = 23.8;
	protected static float fval = 23.6f;
	static char c = 'R';
	
	
	public static void main(String[] args) {
		StaticDemo sd = new StaticDemo();
		sd.m1();
		sd.m2();sd.m3();sd.m4();
		
		
	}

}

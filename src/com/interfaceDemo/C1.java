package com.interfaceDemo;

public class C1 implements I1,I2{

	@Override
	public void m2() {
		System.out.println(y);
		
	}

	@Override
	public void m1() {
		System.out.println(x);
		
	}
	
	public static void main(String[] args) {
		C1 c1obj = new C1();
		c1obj.m1();
		c1obj.m2();
	}

}

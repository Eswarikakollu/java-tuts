package com.oopconcepts;

public class MobileSetGet {
/*
 * 	String os;
	String model;
	int version;
	String color;
 */
	
	public static void main(String[] args) {
		SetGetDemo sgd = new SetGetDemo();
		//"windows","chevron",10,"red"
		sgd.setOs("windows");
		sgd.setModel("chevron");
		sgd.setColor("red");
		sgd.setVersion(10);
		System.out.println(sgd.getColor());
		System.out.println(sgd.getModel());
		System.out.println(sgd.getOs());
		System.out.println(sgd.getVersion());
		
	}
}

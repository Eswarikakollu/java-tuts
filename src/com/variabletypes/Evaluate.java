package com.variabletypes;

public class Evaluate {
	int a =20;
	static int b = 100;
	
	void display()
	{
		System.out.println(b);
	}
	
	static void add()
	{
		Evaluate e = new Evaluate();
		
		System.out.println(e.hashCode());
		System.out.println(b);
	}
public static void main(String[] args) {
	add();
	new Evaluate().display();
}
}

package com.oopconcepts;

public class Dog extends Animal {
	
	
	public String color ="White";
	
	Dog()
	{
		System.out.println("Dog classs constructor");
		
	}
	
	@Override
	public void eat()
	{
		System.out.println("Dog class eat method");
		System.out.println("It is overridden method");
		System.out.println("*************");
	}

	@Override
	public void sound()
	{
		System.out.println("Dog class eat method");
		System.out.println("dog barks");
		System.out.println("*************************");
	}
	
	
	protected void activities()
	{
		System.out.println("Dog likes to run and play");
		System.out.println("Dog likes to dance");
	}
	public static void main(String[] args) {
		Animal a = new Dog(); //this is called upcasting

         Dog d = new Dog();
         d.activities();

         System.out.println(d.color);
		
	}
}

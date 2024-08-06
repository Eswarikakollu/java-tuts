package com.oopconcepts;

public class Cat {
	
	//declaring instance variables.
	String name;
	String colour;
	int age;
	String breed;
	
	//declaring instance methods
	public void sleeping()
	{
		System.out.println("Cat is sleeping");
	}
	
	public void playing()
	{
		System.out.println("Cat is playing");
	}
	
	public void eating()
	{
		System.out.println("Cat is Eating");
	}
	
	public static void main(String[] args) {
		
		//creating object for  class
		//classname varname = new calssname();
		
		Cat thobj = new Cat();
		thobj.name="thorn";
		thobj.age=3;
		thobj.breed="bulldog";
		thobj.colour="brown";
		System.out.println(thobj.name+ " "+thobj.age);
		thobj.playing();
		
		
	Cat robj = new Cat();
	robj.name="thorn";
	robj.age=3;
	robj.breed="bulldog";
	robj.colour="brown";
	System.out.println(robj.name+ " "+robj.age);
	robj.sleeping();
	
	
	System.out.println(robj.hashCode());
		
		
	}

}

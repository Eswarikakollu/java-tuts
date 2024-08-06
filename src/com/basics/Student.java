package com.basics;

public class Student {
	
	String name ;
	int rollno;
	static String collegename ="RSR";
	
	Student(int r,String n)
	{
		rollno =r;
		name =n;
	}
	
	void display()
	{
		System.out.println(rollno+ " "+ name+" "+collegename);
	}
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student(531,"raji");
		Student s2= new Student(546,"saikishore");
		s1.display();
		s2.display();
	}

}

package com.collectionDemos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemoOne {
	
public static void main(String[] args) {
	
	//Declare ArrayList objects
	//al will store duplicate values,heterogenous data ,and maintain insertion order.
	//if i want to store homogenous data by specifying the Wrapper class
	//ArrayList<Integer> all= new ArrayList<Integer>();
	//ArrayList<String> als = new ArrayList<Integer>();
	//List is the parent interface of ArrayList
	//List l = new ArrayList();
	
	ArrayList<Object> al = new ArrayList<Object>();
	al.add(12);
	al.add("welcome");
	al.add(12.5);
	al.add('A');
	al.add(true);
	//priting all the ArrayList elements
	System.out.println(al);  //[12, welcome, 12.5, A, true]
	System.out.println("no of objects in the list :"+al.size());
	
	al.add(1,"Java");
	System.out.println(al);  
	System.out.println("no of objects in the list :"+al.size());
	
	
	al.remove(5);  //we can pass directly an index to remove
	System.out.println(al);  
	System.out.println("no of objects in the list :"+al.size());
	
	al.remove("welcome");  // we can pass value to remove
	System.out.println(al);  
	System.out.println("no of objects in the list :"+al.size());
	
	
	al.add(al.size(), "ArrayList demo");
	
	System.out.println(al);  
	System.out.println("no of objects in the list :"+al.size());
	
	al.add(al.size(), "when");
	System.out.println(al);  
	System.out.println("no of objects in the list :"+al.size());
	
	
	
	al.remove(al.size()-1);
	System.out.println(al);  
	System.out.println("no of objects in the list :"+al.size());
	
	
	

	
	al.set(2, "API");
	System.out.println(al);  
	System.out.println("no of objects in the list :"+al.size());
	
	System.out.println(al.get(2));
	
	System.out.println(al.isEmpty());
	
	//1)printing the ArrayList values using for loop
	
	System.out.println("Printing objects in ArrayList using for loop");
	
	for(int i =0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}
	
	
	System.out.println("***************************");
	
	//2)using foreach
	System.out.println("Printing objects in ArrayList using for-each loop");
	for(Object aaa :al)
	{
		System.out.println(aaa);
	}
	
	
	System.out.println("**********************************");
	//3)Iterator
	System.out.println("Printing objects in ArrayList using Iterator() ");
	Iterator it = al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	

	
	
	
	
	
	
	
	
	
}
}

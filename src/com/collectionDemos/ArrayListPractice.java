package com.collectionDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {
	public static void main(String[] args) {
		

	
	ArrayList<Object> alobj = new ArrayList<Object>();
	
	alobj.add('A');
	alobj.add("Raji");
	alobj.add("welsomce");
	alobj.add(12);
	alobj.add(12.34);
	alobj.add(false);
	System.out.println(alobj);
	
	//insert at specified index
	alobj.add(2, "inserted object");
	System.out.println(alobj);
	System.out.println("index specified extract  :" +alobj.get(3));
	alobj.set(4, 15);
	System.out.println("after setting the 4 th index");
	System.out.println(alobj);
	
	ArrayList<Character> al2 = new ArrayList<Character>();
	al2.add('z');
	al2.add('e');
	al2.add('i');
	al2.add('o');
	al2.add('u');
	System.out.println("Second AL is :" +al2);
	
	//al2.addAll(alobj);
	System.out.println(alobj);
	System.out.println(al2);
	
   Collections.sort(al2);
   System.out.println(al2);
   alobj.remove(4);
   System.out.println(alobj);
   System.out.println("Size of ArrayList is :" +alobj.size());
   
   Collections.shuffle(al2);
   System.out.println(al2);
	
	}
}

package com.collectionDemos;

import java.util.*;
public class LinkedListDemo {
	public static void main(String[] args) {
		
		
		LinkedList<Object> l = new LinkedList<Object>();
		
		
		l.add("A");
		l.add("Rajeswari");
		l.add(12);
		l.add(false);
		l.add(null);
		l.add(12.34);
		System.out.println("Elements isn the linkedlist are : " +l);
		
		System.out.println("index of A is ::"+l.indexOf("A"));
		System.out.println("get the first elemnt in the array"+l.getFirst());
		System.out.println("Last element in the array is :" +l.getLast());
		System.out.println("5 th indexed elemnt is :"+l.get(4));
		System.out.println("size of teh index"+l.size());
		
		System.out.println("before sorting list is :" +l);
	l.remove();
	
		System.out.println("Colelction after removing one objects" +l);
		
		l.remove(3);
		System.out.println("Colelction after removing one objects" +l);
		l.add(3, "java");
		System.out.println("Aftre adding java" +l);
		
		l.addLast("last object");
		System.out.println(l.get(0));
		System.out.println(l.indexOf("java"));
		System.out.println(l.isEmpty());
		
		System.out.println(l.size());
		
		
	}

}

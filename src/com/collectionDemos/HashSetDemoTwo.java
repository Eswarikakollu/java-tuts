package com.collectionDemos;

import java.util.HashSet;

public class HashSetDemoTwo {
public static void main(String[] args) {
	HashSet<Integer> evenNumber = new HashSet<Integer>();
	
	evenNumber.add(2);
	evenNumber.add(4);
	evenNumber.add(6);
	System.out.println(evenNumber);
	HashSet<Integer> evenNumber_new= new HashSet<Integer>();
	
	evenNumber_new.addAll(evenNumber);
	evenNumber_new.add(8);
	System.out.println(evenNumber_new);
	
	evenNumber_new.removeAll(evenNumber);
	System.out.println(evenNumber_new);
	
}
}

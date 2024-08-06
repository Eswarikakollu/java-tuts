package com.collectionDemos;
import java.util.ArrayList;
import java.util.Collections;


public class ArrayListDemoTwo {
	public static void main(String[] args) {
		ArrayList al2 = new ArrayList();
		al2.add('X');
		al2.add('Y');
		al2.add('Z');
		al2.add('A');
		al2.add('B');
		al2.add('C');
		System.out.println(al2);
		ArrayList aldup= new ArrayList();
		aldup.addAll(al2);
		aldup.removeAll(al2);
		
		
		
		System.out.println(aldup);
		System.out.println(al2);
		
		Collections.sort(al2);
		System.out.println(al2);
		
		Collections.shuffle(al2);
		System.out.println(al2);
		
		Collections.reverseOrder();
		System.out.println(al2);
	}

}

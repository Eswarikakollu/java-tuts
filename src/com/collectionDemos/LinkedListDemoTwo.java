package com.collectionDemos;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemoTwo {
	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<String>();
		
		ls.add("one");
		ls.add("two");
		ls.add("three");
		
		LinkedList<String> ls_new = new LinkedList<String>();
		
		ls_new.addAll(ls);
		System.out.println(ls_new);
		Collections.sort(ls_new);
		System.out.println(ls_new);
		
		
		for(int i =0;i<ls_new.size();i++)
		{
			System.out.println(ls_new.get(i));
		}
		
		for(String s : ls_new)

		{
			System.out.println(s);
		}
		
		
		
	}

}

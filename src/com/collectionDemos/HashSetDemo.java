package com.collectionDemos;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet(); //default load factor is 16 and load factor i 0.75
		
		//HashSet hs = new HashSet(100);//we increased the initial capacity to 100
		
		//HashSet hs = new HashSet(100,(float)0.90);
		
		//HashSet<Integer> hs = new HashSet<Integer>();
		
		
		hs.add(100);
		hs.add(12.32);
		hs.add(true);
		hs.add(null);
		hs.add("java");
		System.out.println(hs);
		
		hs.remove(100);  //as no index we need to specify the object /value to remove
		System.out.println(hs);
		
		
		System.out.println(hs.contains(100));//checking aftre removing the value is availablein HasgSet/not
		
		System.out.println(hs.contains("java"));
		System.out.println(hs.isEmpty());
		System.out.println("***************");
		
		//reading elements usinf foreacg loop
		for(Object os: hs)
		{
			System.out.println(os);
		}
		System.out.println("*****************");
		
		//using iterator to get the data from iterator
		
		Iterator it =hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}

package com.collectionDemos;

import java.util.HashSet;

public class HashSetSetOperations {
	
	public static void main(String[] args) {
		
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(1);
		hs1.add(3);
		hs1.add(4);
		hs1.add(5);
		
		

		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(1);
		hs2.add(2);
		hs2.add(3);
		hs2.add(5);
		
		//hs1.addAll(hs2); union operation
		System.out.println(hs1);
		
		hs2.retainAll(hs1);//intersection elements from hs2,hs1 retain fromhs1
		System.out.println(hs2);
		
		
		//
		
		
	}

}

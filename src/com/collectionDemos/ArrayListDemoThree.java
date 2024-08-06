package com.collectionDemos;
import java.util.*;

public class ArrayListDemoThree {
public static void main(String[] args) {
	//CONVETING ARRAY INTO ARRAY LIST
	
	String s1[] = {"dog","ccat","elephant"};
	for(String arr:s1)
	{
		System.out.println(arr);
	}
	
	//Arrays.asList(arrayelement) converts the arras as List Object
	ArrayList al = new ArrayList(Arrays.asList(s1));
	System.out.println(al);
	
}
}

	

package com.collectionDemos;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapDmeoRam {
	
	public static void main(String[] args) {
	
	
	Map<String,Integer> m = new HashMap<String,Integer>();
		//Map<String,Integer> m = new TreeMap<String,Integer>();
		//Map<String,Integer> m = new LinkedHashMap<String,Integer>();
	
	m.put("bob", 102);
	m.put("david", 103);
	m.put("jane", 101);
	m.put("ram", 104);
	m.put("anny",105);
	System.out.println(m);
	
	System.out.println(m.size());
	System.out.println(m.get("david"));
	
	m.remove("anny");
	System.out.println(m);
	
	
	
	System.out.println(m.containsKey("ram"));
	
	
	Set<String> s = m.keySet();
	System.out.println(s);
	
	for(String s1 : s)
	{
		System.out.println(s1);
	}
	
	
	
	Set<Map.Entry<String,Integer>> entries = m.entrySet();
	System.out.println(entries);
	for(Entry<String, Integer> sss : entries)
	{
		System.out.println(sss.getKey() +"  " +sss.getValue());
	}
	
	}
}

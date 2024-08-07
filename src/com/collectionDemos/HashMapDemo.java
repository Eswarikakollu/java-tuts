package com.collectionDemos;
import java.security.KeyStore.Entry;
import java.util.*;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap m = new HashMap();
		//HashMap<Integer,String> m = new HashMap<Integer,String>();
		
		m.put(101, "john");
		m.put(102, "david");
		m.put(103, "scott");
		m.put(104, "mary");
		m.put(105, "tye");
		m.put(105, "raji");  //latesh values to the duplicated key will be replaced/updated..
		m.put(106, "raji");   //duplicate values can be allowed.
		
		
		
		System.out.println(m);
		
		System.out.println(m.get(105));
		m.remove(106);  //remove the pair from hashmap
		System.out.println(m);
		
		System.out.println(m.containsKey(101));  //checks key from map returns t/f
		
		System.out.println(m.containsValue("raji")); //checcks values from map
		
		System.out.println(m.isEmpty());
		
		//get only keys from hashmap
		
		Set s = m.keySet();
		System.out.println(s);//[101, 102, 103, 104, 105]
		
		Collection val = m.values();
		System.out.println(val);  //[john, david, scott, mary, raji]
		
		
		Set entrysetpair = m.entrySet();
		System.out.println(entrysetpair);//[101=john, 102=david, 103=scott, 104=mary, 105=raji]
		
		
		for(Object i : s)
		{
			System.out.println(i);
		}
		
/*101
102
103
104
105*/
		
	
		for(Object a: val)
		{
			System.out.println(a);
		}
		/*john
david
scott
mary
raji*/
		
		
		for(Object l : s)
		{
			System.out.println(l+ " "+m.get(l));
		}

		
		System.out.println("*****************");
		//Entry Interface methods.
		//i want to capture all the entries from hash map
		
		
		Iterator it = entrysetpair.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
	}

}

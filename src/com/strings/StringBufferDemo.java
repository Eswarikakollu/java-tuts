package com.strings;

public class StringBufferDemo {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("java");
		sb.append("selenium");
		System.out.println(sb);
		sb.insert(4, " ");
		System.out.println(sb);
		sb.replace(0, 4, "Ruby");
		System.out.println(sb);
		System.out.println(sb.delete(0,5));
		System.out.println(sb.reverse());
		
		
	}

}

package com.variabletypes;

public class StringDemo {
	
	//acccessmodifier static datatype = values;
	//s7 is global variable here 
	static String s7="Raji is learning";
	

  public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "123+abc";
		String s3 = "Amigo is the best";

	      String s4 = "456";
	      String s5 = s4+"123";
	System.out.println(s5+s7);
	System.out.println(s1 +" " + s2 +" " + s3);
	
	
	String s6 = 2+3+"java";
	System.out.println(s6);
	System.out.println(s6+"selenium");
	
	System.out.println(s6+"5+6+java");
}

}

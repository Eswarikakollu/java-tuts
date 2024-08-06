package com.variabletypes;

public class Test {
static int a1=20 ;
char c='a';
  static void  display()
 {
	 
	 System.out.println(Test.a1);
 }

 public static void main(String[] args) {
	Test t = new Test();
	Integer a =20;
	System.out.println(t.getClass());
	t.display();
}

}

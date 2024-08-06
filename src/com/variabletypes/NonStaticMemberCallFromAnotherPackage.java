package com.variabletypes;

import com.basics.NonStaticMembersDemo;
import com.basics.NonStaticMembersDemo.*;

/*
 * if we want to import the non static members from another package ,first we need to import the package.
 * then create an object for the class and with the help of objref we can access the members of the class.
 * import packagename.classname;
 * 
 * create the object for thet class with the help of 'new' keyword
 * importedpackageclassname objref = new importedpackageclassname();
 * objref.nonstaticvariables;
 */

public class NonStaticMemberCallFromAnotherPackage  extends NonStaticMembersDemo {

	public static void main(String[] args) {
		
		NonStaticMembersDemo nsobj= new NonStaticMembersDemo();
		
		System.out.println(nsobj.i);
		
		nsobj.caliculator();
		nsobj.swapOfTwoNumbers(1, 2);
		
		

	}

}

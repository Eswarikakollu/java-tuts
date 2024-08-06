package com.variabletypes;

/**
 * how to access the static members from another class from different package?
 * first we need to import the package.
 * 
 * import packagename.classname;
 * 
 */

import com.basics.StaticMembesrDemo;

public class callingStaticMembersInDifferentPackage  extends StaticMembesrDemo {
	public static void main(String[] args) {
		
		/*
		 * how can we access one class static members in another package static class.
		 * classname.staticvariable;
		 */
		
		System.out.println("StaticMemberDemo class l variable is :"+StaticMembesrDemo.l);
		
		/*
		 * how can you call one class void static method in amother package.
		 * after importing the pacakge;
		 * classnema.methodname();
		 */
		StaticMembesrDemo.swapOfNumbers(23,34);
		
		/*
		 * how can you call return type static methods in another package .
		 * returntypedattype varname = classname.methodname();
		 * sysout(varname);
		 */
		System.out.println(StaticMembesrDemo.getRandomNumber());
		
		
	}
	

}

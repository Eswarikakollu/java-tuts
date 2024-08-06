package com.basics;

public class callingStaticMembersInSamePackage {
	
public static void main(String[] args) {
	
	/**
	 * how can we call static members of a class in same package another class
	 * classname.staticvariable.
	 * 
	 */
	
	System.out.println("sttaic member from another class is :"+StaticMembesrDemo.l);
	
	
	
	/**
	 * how can you call one class void static method in another class of same package.
	 * classname.methidname();
	 * 
	 */
	
	StaticMembesrDemo.getRandomNumber();
	
	/*how can you call returntype static method with parameters in another class of same package
	 * 
	 * returntypedatatyep varname = classname.methodname(parameter1,parameter2..);
	 */
	
	//int sum=StaticMembesrDemo.sunOfNaturalNumber(10);
	//System.out.println(sum);
	
	/**
	 * how call the returntype static method in the print statement?
	 * ptintstatment(classname.returntypestaticmethod());
	 * 
	 */
	
	System.out.println(StaticMembesrDemo.sunOfNaturalNumber(5));
}

}

package com.basics;

public class callingNonStaticMembersInSamePackageAnotherClass {

	
	public static void main(String[] args) {
		/*
		 * how to access the nonstatic memebres of another class of same package
		 * classname objrev = new classname();
		 * objerev.nonstatic members;
		 */
		NonStaticMembersDemo nbobj = new NonStaticMembersDemo();
		
		/*
		 * calling nonctatic void method in another classs static method
		 * objerev.methodname();
		 * 
		 */
		nbobj.swapOfTwoNumbers(1,2);
		
		/*
		 * calling nonstatic  returntype parameteraized method from another class with return type 
		 * returntypedatatype varname = objeref.nonstaticmethod();
		 * 
		 */
		int res= nbobj.differencOfEvenOddSum(50);
		System.out.println("difference of even n odd sum is "+res);
		
		/*
		 * calling nonstatic void methodname without parameters.
		 * objref.nonstaticvoidmethodname();
		 */
		nbobj.caliculator();
		
	}
}

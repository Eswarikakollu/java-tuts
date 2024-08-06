package com.oopconcepts;

public class InterfaceDemo implements Shape{

	@Override
	public void circle() {
		System.out.println("This is circle in democlass -implemented here ");
		
	}
	
	static void triangle()
	{
		System.out.println("Idemo class static method()");
	}
	
	 public void square()
	{
		System.out.println("idemo class square method");
	}

	 public void pentagon()
	 {
		 System.out.println("idemo pentagon method");
	 }
	 public static void main(String[] args) {
		
		 //scenario1
		 InterfaceDemo idobj = new InterfaceDemo();
		 idobj.circle();  //abstract method given implementation
		 idobj.square();  //overridden method from interface
		 
		// triangle(); //direct ga calll cheyachu static method ni 
		             //else classname.static methid();
		 InterfaceDemo.triangle();
		 idobj.pentagon();  //can possible with class obj
		 
		 
		 //scenario2 
		 Shape sobj = new InterfaceDemo();
		 sobj.circle();sobj.square();
		
		// sobj.pentagon();//is not possible because of interface obj ,
		 
	}
}

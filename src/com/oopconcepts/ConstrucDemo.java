package com.oopconcepts;


//student details
public class ConstrucDemo {
	String name;
	String id;
	String branch;
	double fee;
	
	//acceessspecifier classname (){..}
	public ConstrucDemo()
	{
		System.out.println("This is default constructor");
	}
	
	//parameteraisec constructor
	//accessspecifier void classname(p1 vaue,p2 value..p3 values) {.values.}
	public ConstrucDemo(String name,String id,String branch,double fee)
	{
		this.name=name;
		this.id=id;
		this.fee=fee;
		this.branch=branch;
		
	}
	
	//accessspecifier void classname (p1 pv..){}
	public ConstrucDemo(String name,String id)
	{
		this.name=name;
		this.id=id;
		
	}
	
	public ConstrucDemo(String name,String id,String branch)
	{	
		this.id = id;
		this.branch=branch;
		
		this.branch=branch;
		
		
	}


	public void displayDetails()
	{
		System.out.println("Displaying student details");
		System.out.println(name); //even ikkada name ani rasina internal ga this.name ane call chestadi.
		System.out.println(this.id); //this represents the current class variables
		System.out.println(branch);
		System.out.println(this.fee);
		
	}
	
	public static void main(String[] args) {
		ConstrucDemo cd = new ConstrucDemo();
		cd.displayDetails();
		System.out.println("************************");
		
		ConstrucDemo cd1 = new ConstrucDemo("Rai","531","cse");
		cd1.displayDetails();
		System.out.println("************************");
		
		ConstrucDemo cd2 = new ConstrucDemo("Rai","531","cse",2000);
		cd2.displayDetails();
		System.out.println("************************");
		
		ConstrucDemo cd3 = new ConstrucDemo();
		cd3.displayDetails();
		System.out.println("************************");
		
	}
	
	
	

}

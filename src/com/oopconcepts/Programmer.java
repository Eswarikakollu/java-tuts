package com.oopconcepts;

public class Programmer extends Manager{

	
	public Programmer(double bonus){
		super(bonus);  //it calls the parent class constrcuctor.
		
		//super refers to the immediate parent class variable/methods.
	}
	
	protected void designApp() {
		System.out.println("Designer designs the application");
	}
	
	public static void fixBugs()
	{
		System.out.println("Programmer fixes the bugs");

	}
	
	public static void main(String[] args) {
		
		
		Programmer p = new Programmer(500);
		fixBugs();
		sendNotification();
		manageTeam();
		p.attendMeeting();
		p.setEmpid(543);
		p.setSalary(30000);
		p.attendMeeting();
		p.setName("bhavya");
		
		System.out.println(p.getName());
		System.out.println(p.getEmpid());
	}
}

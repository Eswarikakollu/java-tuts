package com.oopconcepts;


//all the employee class variables and methods have the privilage to use them
public class Manager extends Employee {
	
	
	private double bonus;
	
	//instead of getters and setters creating constructor to initialize the variables.
	
	public Manager(double bounus)
	{
		this.bonus=bonus;
	}
	
	protected static void manageTeam()
	{
		System.out.println("Manager class  manageteam  method");
		System.out.println("Manger provides the task to team");
		
	}
	
	protected  void attendMeeting()
	{
		System.out.println("Manager class  attend meeting  method");
		System.out.println("Manger attends the mettings team");
		
	}
	
	public static void main(String[] args) {
		
		
		//static methods calling process  Manager class static method
		
		Manager.manageTeam();   // manageTeam();  both are same 
		//we can call directly method name/with classname.staticmethodname();
		
		
		
		//employee class static method.
		setCompanyname("AtosSyntel"); //Employee.setCompanyname("Syntel");
		
		Employee.sendNotification();
		
		//Employee e = new Employee(); parent class ki object create cheste child class vatini call cheyalem kada so create object for hild class
		
		
		Manager m = new Manager(20000.00);
		/*m.setEmpid(531);
		m.setName("raje");
		m.setSalary(100.00);
		m.setCompanyname("synstel");*/
		
		m.attendMeeting();m.manageTeam();
		
		System.out.println(m.getEmpid());
		System.out.println(m.getName());
	  
	    System.out.println( getCompanyname() );
	    
	}

}

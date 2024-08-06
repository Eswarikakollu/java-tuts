package com.oopconcepts;

public class Tester extends Employee {
	
	public static void testApp()
	{
		System.out.println("Tester tests the applications");
	}
	
	protected void raiseBug()
	{
		System.out.println("Tester creates the bugs");
	}
	
	public static void main(String[] args) {
		Tester t1 = new Tester();
		t1.setEmpid(508);
		t1.setName("pratyusha");
		t1.setSalary(100);
		t1.setCompanyname("TCS");
		 Tester t2= new Tester();
		 t2.setEmpid(509);
			t2.setName("jostna");
			t2.setSalary(1000);
			t2.setCompanyname("hcl");
			
			System.out.println(t1.getName());
		 System.out.println(t2.getEmpid());
		 
		 testApp();
		 new Tester().raiseBug();
		 
		 
	}

}

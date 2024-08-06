package com.oopconcepts;

public class Employee {
	
	private String name;
	private int empid;
	private double salary;
	private static String companyname;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static String getCompanyname() {
		return companyname;
	}
	public static void setCompanyname(String companyname) {
		Employee.companyname = companyname;
	}
	
	
	//accessmodifier static void methodname(){.logic.}
	protected static void sendNotification()
	{
		System.out.println("Salaray credited");
	}
	
	private void getAccess()
	{
		System.out.println("Employee classs -getaccess method");
	}
}

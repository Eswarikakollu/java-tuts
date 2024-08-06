package com.oopconcepts;

public class SetterGetter {
	
	private int age;
	private String name;
	private String college;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		
		this.college = college.toUpperCase();
	}
	

}

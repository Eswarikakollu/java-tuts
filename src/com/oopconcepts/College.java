package com.oopconcepts;
 
class College
{
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;
	
	College(String name)
	{
		setName(name);
		
	}
	
	public void manageName(SetterGetter sg ,int age,String name,String college)
	{
		sg.setAge(age);
		sg.setCollege(college);
		sg.setName(name);
		
		System.out.println(sg.getAge());
		System.out.println(sg.getCollege());
		System.out.println(sg.getName());
	}
}
	
  


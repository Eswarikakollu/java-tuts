package com.oopconcepts;

public class Vehicle {
	
	int speed;
	public Vehicle()
	{
		System.out.println("This is vehicle class default constructor");
	}
	

	public void run(int speed)
	{
		System.out.println("Vehicle class instance method:" +this.speed+speed);
	}
	
	public static void changeGear()
	{
		System.out.println("Chnaging the gear from stop");
	}
	
	
	public static void start()
	{
		System.out.println("Vehicle started running in vehicle class");
	}
	public static void stop()
	{
		System.out.println("Vehicle stopped runnign in vehicle class");
	}
}

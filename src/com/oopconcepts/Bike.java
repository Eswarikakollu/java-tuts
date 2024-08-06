package com.oopconcepts;

public class Bike extends Vehicle {
	
	private int speed = 50;
	
	
	public Bike()
	{
		System.out.println("Bike class constructor");
	}
	@Override
	
	public void run(int speed)
	{
		System.out.println(" Bike method run method");
	}

	protected void showData()
	{
		System.out.println("Bike class cpeed variable "+ this.speed);
		System.out.println("Parent class speed variable :"+super.speed);
		
		this.run(speed);
		super.run(speed);
	}
	
	public static void main(String[] args) {
		
		Vehicle v = new Bike();
		System.out.println("********************");
		System.out.println(v.hashCode());
		
		System.out.println("_________________________");
		start();
		System.out.println("&&&&&&&&&&&&&&&&&");
		stop();
		System.out.println("^^^^^^^^^^^^^^^^^^");
		v.run(500);
		System.out.println("+++++++++++++++++++++++");
		new Bike().showData();
	}
}

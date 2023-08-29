package com.bptn.course.week2.day2.overriding;

public class Bike extends Vehicle{
	String bikeHandle;
	
	public Bike(String color, String brand, String bikeHandle) {
		super(color, brand);
	}
	
	@Override  
    public void print() {
        System.out.println("I am Bike");
    }
	
}

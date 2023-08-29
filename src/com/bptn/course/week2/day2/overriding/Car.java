package com.bptn.course.week2.day2.overriding;

public class Car extends Vehicle{
	String steeringWheel;
	
	public Car (String color, String brand, String s) {
		super(color, brand);
	}
	
	@Override
    public void print() {
        System.out.println("I am Car");
    }
	
}

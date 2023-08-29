package com.bptn.course.week2.day2.overriding;

public class Vehicle {

	private String color;
	private String brand;
	
	 public Vehicle(String c, String b) {
		color = c;
		brand = b;
	}
	 
	 public void print() {
		 System.out.println(this.color + " " + this.brand);
	 }
	
	
}

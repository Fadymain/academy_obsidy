package com.bptn.course.week2.day3.super_basics;

public class Car extends Vehicle{
	
	//instance variable 
	   String steeringWheel;

	   //
	   public Car(String c, String b, String s) {
		   super(c, b);
		   this.steeringWheel = s;
	   }
	   
	   public void print() {
	    	System.out.println(this.colour + " " + this.brand);
	   }	    

}

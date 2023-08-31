package com.bptn.course.week2.day3.super_basics;

public class Bike extends Vehicle {

	 //Declare an instance variable- String bikeHandle
	  String bikeHandle; 

	   //add parameterized constructor- use super keyword to call parent constructor
	 public Bike(String c, String b, String h) {
		 super(c, b);
		 this.bikeHandle = h;
	 }
	 
	 public void print() {
	    	System.out.println(this.colour + " " + this.brand);
	   }
	
}

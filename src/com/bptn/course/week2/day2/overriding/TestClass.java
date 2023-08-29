package com.bptn.course.week2.day2.overriding;

public class TestClass {

	
	public static void main(String args[]) {
	       Car car = new Car("White", "Audi", "ChromeColored");
	       car.print();

	       Bike bike = new Bike("Grey", "Bianchi", "SilverColored");
	       bike.print();
	   }
}

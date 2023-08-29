package com.bptn.course.week2.day2;

public class Add {
	

	static int add(int a, int b) {
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	static double add(double a, double b) {
		return a + b;
	}
	
	
	
	
	
	
	public static void main(String args[]) {
	       Add obj = new Add();
	       System.out.println(obj.add(12, 21));
	       System.out.println(obj.add(11, 23, 10));
	       System.out.println(obj.add(100.10, 200.5));
	   }
}

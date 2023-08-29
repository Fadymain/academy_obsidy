package com.bptn.course.week1;

public class Fibonacci {
	public static void main(String[] args) {

		 // Predefined numbers to start off the Fibonacci series:
		 int num1 = 0; 
		 int num2 = 1; 
		 int num3; 
		 int i; 
		 int count = 10; 
		 
		 System.out.println(num1 + " " + num2);
		 
		 for(i=2; i < count; i++) {
			 num3 = num1 + num2;
			 System.out.println(" " + num3);
			 num1 = num2;
			 num2 = num3;
		 }

		 

		 
		}
}

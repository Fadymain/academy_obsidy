package com.bptn.course.week4.day5.teachBack;

public class Calculator {

	
	//ADDITION
	public int add(int a, int b) {
        return a + b;
    }
	
	//MULTIPLICATION
	public int multiply(int a, int b) {
        return a * b;
    }
	
	//ISEVEN
	public boolean isEven(int a) {
        return a % 2 == 0;
    }
	
	//POSITIVE NUMBER
	public int abs(int a) {
        return Math.abs(a);
    }
	
	//NULL
	public String getHello() {
        return null;
    }
	
	//DIVISION & EXCEPTION
	public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (double) a / b;
    }
}

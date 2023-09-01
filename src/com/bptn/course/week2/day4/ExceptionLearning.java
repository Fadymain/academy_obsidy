package com.bptn.course.week2.day4;

public class ExceptionLearning {

	public static void main(String[] args) {

        try {
            
        	int a = 11;
        	int b = 0;
        	System.out.println(a / b);
        	
        } catch (ArithmeticException e) {
        	
        	System.out.println("The number cannot be divided by zero");
            
        }
    }
	
}

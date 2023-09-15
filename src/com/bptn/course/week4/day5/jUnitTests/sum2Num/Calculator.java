package com.bptn.course.week4.day5.jUnitTests.sum2Num;


	
	 
	public class Calculator {
	    
		
		public int add(int a, int b) {
	        return a + b;
	    }

	    public int subtract(int a, int b) {
	        return a - b;
	    }

	    public int multiply(int a, int b) {
	        return a * b;
	    }

	    public double divide(int a, int b) {
	        if (b == 0) {
	            throw new ArithmeticException("Division by zero");
	        }
	        return (double) a / b;
	    }

	    public double squareRoot(double a) {
	        if (a < 0) {
	            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
	        }
	        return Math.sqrt(a);
	    }

	    public int abs(int a) {
	        return Math.abs(a);
	    }

	    public boolean isEven(int a) {
	        return a % 2 == 0;
	    }

	    public String getNonNullString() {
	        return "This is a non-null string";
	    }

	    public String getNullString() {
	        return null;
	    }
	}


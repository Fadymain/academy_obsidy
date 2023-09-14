package com.bptn.course.week4.recursion;

public class Fibonaccirecursion {

	// Recursive method to calculate the nth Fibonacci number
    public static int calculateFibonacci(int n) {
        
    	if(n <= 0) {
    		return 0;
    	}
        
        
    	if(n == 1) {
    		return 1;
    	}
        
        // For other values of n, calculate Fibonacci(n) recursively
    
    	int fm1 = calculateFibonacci(n - 1);
    	int fm2 = calculateFibonacci(n - 2);
    	
        return fm1 + fm2;      
    }


    public static void main(String[] args) {
        System.out.println("First 10 Fibonacci Numbers:");

        
        for (int i = 0; i < 10; i++) {
            int result = calculateFibonacci(i);
            System.out.println("Fibonacci(" + i + ") = " + result);
        }
    }
	
}

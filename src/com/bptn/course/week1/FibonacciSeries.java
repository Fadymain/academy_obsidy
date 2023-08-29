package com.bptn.course.week1;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		
		int n = scanner.nextInt();
		
		int first = 0; 
        int second = 1;
        
        if (n <= 0) {
        	
			System.out.println("Restart and enter a positive number.");
			
		} else {
			
			System.out.print("Fibonacci Series up to " + n + " elements: ");
			
			for (int i = 0; i < n; i++) {
				System.out.print(first + " ");
				
				int numSum = first + second;
				first = second;
				second = numSum;
				
			}
		}
        scanner.close();
	}

}

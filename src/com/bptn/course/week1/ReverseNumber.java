package com.bptn.course.week1;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter your number: ");
		int inputNumber = sc.nextInt();
		
		int remainder = 0;
		int reversedValue = 0;
		
		while(inputNumber != 0) {
			remainder = inputNumber % 10;
			reversedValue = reversedValue * 10 + remainder;
			inputNumber = inputNumber / 10;
		}
		System.out.println(reversedValue); 
		sc.close();
	}

}

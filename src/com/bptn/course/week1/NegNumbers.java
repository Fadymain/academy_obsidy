package com.bptn.course.week1;
import java.util.Scanner;

public class NegNumbers {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num = sc.nextInt();

		if(num < 0) {
			System.out.println("You negative entry is : " + num);
		} else {
			System.out.println("Your positive entry is: " + num);
		}
		
		sc.close();
	}

}

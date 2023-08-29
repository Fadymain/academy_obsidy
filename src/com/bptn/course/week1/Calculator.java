package com.bptn.course.week1;
import java.util.Scanner;
import java.lang.Math;

public class Calculator {

	
	public static void main(String[] args) {
		
		
		do {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("/................Calculator Menu................/");
			System.out.println("Press 1 for addition \n"
					+ "Press 2 for subtraction \n"
					+ "Press 3 for multiplication \n"
					+ "Press 4 for division \n"
					+ "Press 5 to square a number \n"
					+ "Press 6 to find a square root \n"
					+ "Press 7 to find the reciprocal");

				double input = sc.nextInt();
				double firstNum;
				double secondNum;
				double total;
				double remainder;
				
			
			 
			sc.close();
			
			if(input == 1) {
				
				System.out.println("Enter the first number: ");
			    firstNum = sc.nextInt();
				System.out.println("Enter the second number: ");
			    secondNum = sc.nextInt();
			    total = firstNum + secondNum;
				
				System.out.println("The addition of the numbers " + firstNum + " and " + secondNum + " is = " + total);
				System.out.println("To continue calculation Press 1, else press any other number to exit");
				
				firstNum = sc.nextInt();
				if(firstNum == 1) {
					continue;
				} else {
					break;
				}
				
			} else if(input == 2) {
				
				System.out.println("Enter the first number: ");
			    firstNum = sc.nextInt();
				System.out.println("Enter the second number: ");
			    secondNum = sc.nextInt();
			    total = firstNum - secondNum;
				
				System.out.println("The subtraction of the numbers " + firstNum + " and " + secondNum + " is = " + total);
				System.out.println("To continue calculation Press 1, else press any other number to exit");
				
				firstNum = sc.nextInt();
				if(firstNum == 1) {
					continue;
				} else {
					break;
				}
				
			} else if(input == 3) {
				
				System.out.println("Enter the first number: ");
			    firstNum = sc.nextInt();
				System.out.println("Enter the second number: ");
			    secondNum = sc.nextInt();
			    total = firstNum * secondNum;
				
				System.out.println("The product of the numbers " + firstNum + " and " + secondNum + " is = " + total);
				System.out.println("To continue calculation Press 1, else press any other number to exit");
				
				firstNum = sc.nextInt();
				if(firstNum == 1) {
					continue;
				} else {
					break;
				}
				
			}  else if(input == 4) {
				
				System.out.println("Enter the first number: ");
			    firstNum = sc.nextInt();
				System.out.println("Enter the second number: ");
			    secondNum = sc.nextInt();
			    total = firstNum / secondNum;
			    remainder = firstNum % secondNum;
				
				System.out.println("Dividing " + firstNum + " by " + secondNum + " the quotient is " + total + "\n"
						+ "The remainder is " + remainder );
				System.out.println("To continue calculation Press 1, else press any other number to exit");
				
				firstNum = sc.nextInt();
				if(firstNum == 1) {
					continue;
				} else {
					break;
				}
				
			} else if(input == 5) {
				
				System.out.println("Enter the first number: ");
			    firstNum = sc.nextInt();
			    total = firstNum * firstNum ;
				
				System.out.println("The square of the number " + firstNum + " is = " + total);
				System.out.println("To continue calculation Press 1, else press any other number to exit");
				
				firstNum = sc.nextInt();
				if(firstNum == 1) {
					continue;
				} else {
					break;
				}
				
			}  else if(input == 6) {
				
				System.out.println("Enter the first number: ");
			    firstNum = sc.nextInt();
			    total = Math.sqrt(firstNum);
				
				System.out.println("The square of the number " + firstNum + " is = " + total);
				System.out.println("To continue calculation Press 1, else press any other number to exit");
				
				firstNum = sc.nextInt();
				if(firstNum == 1) {
					continue;
				} else {
					break;
				}
				
			} else if(input == 7) {
				
				System.out.println("Enter the first number: ");
			    firstNum = sc.nextInt();
			    total = 1 / firstNum;
				
				System.out.println("The Reciprocal of the number " + firstNum + " is = " + total);
				System.out.println("To continue calculation Press 1, else press any other number to exit");
				
					firstNum = sc.nextInt();
					if(firstNum == 1) {
						continue;
					} else {
						break;
					}
				
			} else if(input == 0 || input > 7) {
				
				System.out.println("Invalid choice! Please make a valid choice. \n"
						+ "To continue calculation Press 1, else press any other number to exit");
				firstNum = sc.nextInt();
				if(firstNum == 1) {
					continue;
				} else {
					break;
				}
			    
				
			}
			} while (true);
		
	}
}

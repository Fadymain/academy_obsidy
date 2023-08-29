package com.bptn.course.week1;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		int targetNumber =10;
        int guess =0;
        String output;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 100.");
        
        while (guess != targetNumber){
            guess = scanner.nextInt();
            if(guess > targetNumber && !(guess> 100) ){
                output = "Too high! Try again.";
                System.out.println(output);
                System.out.println("Please enter a number between 1 and 100.");
            }else if(guess >100 ) {
                output = "Please enter a number between 1 and 100.";
                System.out.println(output);
            }else if(guess < targetNumber) {
                output ="Too low! Try again.";
                System.out.println(output);
                System.out.println("Please enter a number between 1 and 100.");
            }else {
                System.out.println("Congratulations! You guessed the number correctly!");
                break;
            }
        }
        scanner.close();

	}

}

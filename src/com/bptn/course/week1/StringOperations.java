package com.bptn.course.week1;
import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

			do {
			Scanner sc = new Scanner(System.in);
			System.out.println("/................String Menu................/ ");
			System.out.println("Press 1 for Palindrome Check \n"
					+ "Press 2 to reverse a String \n"
					+ "Press 3 to Concatenate two Strings \n"
					+ "Press 4 for String Comparison \n"
					+ "Press 5 to Calculate the Length of String ");
			
			
			int input = sc.nextInt();
			String str1;
			String str2;
			String reverseInput = "";
			
			if (input == 1) {
				System.out.println("Palindrome Check \nInput a word");
				sc.nextLine();
				str1 = sc.nextLine();
				System.out.println("The word is " + str1);
				   for(int i = str1.length() - 1; i>=0; i--) {
			    	   reverseInput += str1.charAt(i);
			    	   str1.toLowerCase();
			    	   reverseInput.replace(" ","");
			       }
				   if(str1.equalsIgnoreCase(reverseInput)) {
			    	   System.out.println("this word is a palindrome");
			       }
				   else { System.out.println("This word is not palindrome");    
		    	   }
			    	 
		    } else if (input == 2) {
		    	System.out.println("Input a word");
		    	sc.nextLine()
;		    	str1 = sc.nextLine();
		    	System.out.println("The word is " + str1);
		    	for(int i = str1.length() - 1; i>=0; i--) {
			    	   reverseInput += str1.charAt(i);
		    	}
		    	System.out.println(reverseInput);

		    } else if (input == 3) {
		    	System.out.println("Input a first word");
		    	sc.nextLine();
		    	str1 = sc.nextLine();
		    	System.out.println("Input a second word");
		    	str2 = sc.nextLine();
		    	str1 = str1.concat(str2);
		    	
		    	System.out.println("Your new string: " + str1 );
		    
		    } else if (input == 4) {
		    	System.out.println("Input a first word");
		    	sc.nextLine();
		    	str1 = sc.nextLine();
		    	System.out.println("Input a second word");
		    	str2 = sc.nextLine();
		    	if (str1.equals(str2)) {
		    		System.out.println("The entered strings are equal");
		    	} else {
		    		System.out.println("The entered strings are not equal");
		    	}
		    	 
		    } else if (input == 5) {
		    	System.out.println("Input a first word");
		    	sc.nextLine();
		    	str1 = sc.nextLine();
		    	System.out.println("The length of the entered string is: " + str1.length());
		    } else {
		    	System.out.println("Invalid choice! Please make a valid choice.");
		    }
			} while (true);	
	}
}

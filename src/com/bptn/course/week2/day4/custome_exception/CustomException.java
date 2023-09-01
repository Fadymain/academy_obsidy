package com.bptn.course.week2.day4.custome_exception;
import java.util.Scanner;

public class CustomException {
	
	
	
	private static void validateFileExtension(String fileName) throws FileExtensionException {
		if(!fileName.endsWith(".txt")) {
			throw new FileExtensionException("File doesn't have .txt extension");
		}
	}
	
	 public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the file name with correct extension i.e. .txt ");
	        String fileName = scanner.nextLine();
	        
	        
	        try {
	        	validateFileExtension(fileName);
	        	System.out.println("Correct file name with extension .txt");
	        	
	        } catch(FileExtensionException ex) {
	        	System.out.println("Error: " + ex.getMessage());
	        }
	        finally {
	        	scanner.close();
	        }
	    }

}

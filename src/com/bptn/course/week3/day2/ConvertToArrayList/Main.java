package com.bptn.course.week3.day2.ConvertToArrayList;
import java.util.List;
import java.util.ArrayList;

public class Main {
	
	// Complete the functionality of the method below
    public static  List<String> convertArrayToList(String[] inputArray) {
        
        // Create a new ArrayList of String. 
    	ArrayList<String> str = new ArrayList<>();

        // Iterate inputArray using a for-each loop and add the elements to the new ArrayList. Hint: Use add() method to add elements to ArrayList.
    	for (String input: inputArray) {
    		str.add(input);
    	}
    	
        // return the new list with elements.
    	return str;
    }
 
   
    // Do not modify the code below
    public static void main(String[] args) {

        String [] cars = {"Volvo","Honda","Ford"};

        List<String> arraylist = convertArrayToList(cars);

        System.out.println(arraylist);
    }

}

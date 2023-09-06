package com.bptn.course.week3.day2;
import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
        // Create an ArrayList of integers to store numbers
		ArrayList<Integer> arrayList = new ArrayList<>();
      

        // Add elements to the ArrayList
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
   
        
         System.out.println("ArrayList Elements:");
        // Access and print elements in the ArrayList using for-each loop
         for(int num: arrayList) {
        	 System.out.println(num);
         }
        
       

        // Update an element at index 2 (third element) to 35
         arrayList.set(2, 35);
      
        // Remove an element at index 1 (second element, which is 20)
         arrayList.remove(1);
       

        // Print the size of the ArrayList
        System.out.println("Size of ArrayList: " + arrayList.size());
    }

}

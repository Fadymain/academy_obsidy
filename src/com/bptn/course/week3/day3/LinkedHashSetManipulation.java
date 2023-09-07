package com.bptn.course.week3.day3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetManipulation {
	
	public static void main(String[] args) {
		// Create a LinkedHashSet and populate it with the elements A, B and C.
		Set<String> set = new LinkedHashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");

		// Print the size of the set
		System.out.println("Set size: " + set.size());

		// Use for each loop to print the elements in the set
		System.out.println("Elements in the set (using for wach loop):");
		for (String element : set) {
            System.out.println("Element: " + element);
        }

		// Use iterator to print the elements in the set
		System.out.println("Element in the set (using iterator):");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

		// Use remove() method to remove the element A from the set
		set.remove("A");
		System.out.println("Set after using remove(): " + set);
		
        
		// Use contains() method to check if the element B exists in the set
		if(set.contains("B")) {
			System.out.println("Element 'B' exists in the set.");
		} else {
			System.out.println("Element 'B' does not exist in the set.");
		}

		// Use clear() method to remove all elements from the set
		set.clear();

        // Print the set to show that it is empty.
        System.out.println("Set after using clear(): " + set);
	}

}

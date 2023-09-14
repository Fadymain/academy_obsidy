package com.bptn.course.week4.recursion.lambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringFilter {
	
	public static void main(String[] args) {
        
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry"));
        
        char c = 'e';
        
        System.out.println("List before filtering: " + list);
        
        list.removeIf(str -> str.indexOf(c) != -1);        
        // Print the list after filtering
        System.out.println("List after filtering: " + list);
    }

}

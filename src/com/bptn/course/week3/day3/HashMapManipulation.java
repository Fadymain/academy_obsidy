package com.bptn.course.week3.day3;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapManipulation {
	
	public static void main(String[] args) {
		// Create a HashMap and populate it with initial key-value pairs
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);

		// Print the size of the map
		System.out.println("Map size: " + map.size());
		

		// Use a for loop to print the key-value pairs in the map
		for (Entry<String, Integer> entry: map.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println("Key: " + key + ", Value: " + value);
		}
		

		// Use get() method to get the value of key "A"
		Integer value = map.get("A");
		System.out.println("Value of key 'A': " + value);


        // use put() method to add a new key-value pair to the map
		map.put("D", 4);
		System.out.println("Map after adding new key-value pair:");
		for (Entry<String, Integer> entry: map.entrySet()) {
			String key = entry.getKey();
			Integer newValue = entry.getValue();
			
			System.out.println("Key: " + key + ", Value: " + newValue);
		}
		

		// Use the containsKey() method to check if the key "C" exists in the map
		if(map.containsKey("C")) {
			System.out.println("Key 'C' exists in the map");
		} else {
			System.out.println("Key 'C' does not exist in the map");
		}
		

	}

}

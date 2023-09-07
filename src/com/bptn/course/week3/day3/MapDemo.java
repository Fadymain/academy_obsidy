package com.bptn.course.week3.day3;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<Integer, String> numbers = new HashMap<>();
		
		numbers.put(1, "one");
		numbers.put(2, "two");
		numbers.put(3, "three");
		numbers.put(4, "four");
		numbers.put(5, "five");
		numbers.put(6, "six");
		numbers.put(7, "seven");
		numbers.put(8, "eight");
		numbers.put(9, "nine");
		numbers.put(10, "ten");
		
		for(Integer key : numbers.keySet()) {
			System.out.println(key + " : " + numbers.get(key));
		}
		
		numbers.remove(7);
		numbers.put(11, "eleven");
		
		for(Integer key : numbers.keySet()) {	
			System.out.println(key + " : " + numbers.get(key));
		}

    }

}

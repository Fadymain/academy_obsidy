package com.bptn.course.week4.day4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberList {
	
	public static void main(String[] args) {
        
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        
        List<Integer> evenList = list.stream() 
        									.filter(num -> num % 2 == 0)
        									.collect(Collectors.toList());
                                     
        
        System.out.println("Original list: " + list);
        System.out.println("Even numbers list: " + evenList);
    }

}

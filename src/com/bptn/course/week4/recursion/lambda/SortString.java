package com.bptn.course.week4.recursion.lambda;
import java.util.Arrays;
import java.util.List;

public class SortString {
	
	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("foo", "bar", "baz", "qux", "quux");
        
        System.out.println("Before sorting " + strings);

        strings.sort((a, b) -> a.compareTo(b));

        System.out.println("After sorting " + strings);
    }

}

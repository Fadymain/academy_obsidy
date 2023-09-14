package com.bptn.course.week4.day4;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercise {
	
	public static void main(String[] args) {
        
		List<String> words=Arrays.asList("apple","banana","cherry","date","elderberry"); 

        long count = words.stream().count();
         
        System.out.println("Count numbers of words in the list " +  count);

        words.forEach(word -> System.out.println(word));
        
        List<String> upperCaseWords = words.stream()
        										.map(String :: toUpperCase)
        										.collect(Collectors.toList());
       
        System.out.println("Words in upper case " +  upperCaseWords);
    }

}

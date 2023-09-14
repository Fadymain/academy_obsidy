package com.bptn.course.week4.recursion.lambda;
import java.util.ArrayList;

public class ArrayListModification {
	
	public static void main(String[] args) {
        
        ArrayList<String> languages = new ArrayList<>(); 

        languages.add("java");
        languages.add("javascript");
        languages.add("swift");
        languages.add("python");
        
        
        
        System.out.println("Original ArrayList:");
        
        languages.forEach(language -> System.out.println(language));

        languages.replaceAll(language -> language.toUpperCase());

        System.out.println("\nUpdated ArrayList:");
         
        languages.forEach(language -> System.out.println(language));
    }

}

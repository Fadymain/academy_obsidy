package com.bptn.course.week3.day5;
import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
	
	public static void main(String[] args) {
        String sentence = "This is a test sentence with no repeating words";

        
        String[] words = sentence.split(" ");

        
        Map<String, Integer> wordFrequency = new HashMap<>();

        
        for (String word : words) {
             
            if (wordFrequency.containsKey(word)) {
                int frequency = wordFrequency.get(word);
                wordFrequency.put(word, frequency + 1);
            }
           
            else {
            	wordFrequency.put(word, 1);
            }
        }

        // Print the frequency of each word
        System.out.println("Word frequency: " + wordFrequency);
    }

}

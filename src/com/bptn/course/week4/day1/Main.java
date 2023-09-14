package com.bptn.course.week4.day1;
import java.util.Arrays;
import java.util.Random;

public class Main {
	
public void Start(){
        
        int[] array = {3, 6, 1, 4, 2, 9, 7, 8, 5, 0};
        int key = 1;


        Arrays.sort(array);

        //sort array
        int result = binarySearch(array,key);

        //Print values in array after sort
        System.out.println("Input: arr = " + Arrays.toString(array) + ", x = " + key);
        if (result != -1) {
            System.out.println("Output: " + result + ".");
            System.out.println("Explanation: Element x is present at index " + result + ".");
        } else {
            System.out.println("Output: -1.");
            System.out.println("Explanation: Element x is not present in the given array.");
        }
    }

    int binarySearch(int arr[], int key) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int guess = (min + max) / 2;

            if (arr[guess] == key) {
                return guess; // Element found, return the index
            } else if (arr[guess] < key) {
                min = guess + 1; // Adjust the search range to the right half
            } else {
                max = guess - 1; // Adjust the search range to the left half
            }
        }

        return -1;  
    }
    
       public static void main(String[] args) {
        Main main = new Main();
        main.Start();
    }

}

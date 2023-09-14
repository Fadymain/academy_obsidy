package com.bptn.course.week4.recursion.challenge;
import java.util.Arrays;

public class Main {
	
	public static void main(String args[]) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        System.out.print("Printing original array: ");
        System.out.println(Arrays.toString(arr));

        // sort array
        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Printing sorted array: ");
        System.out.println(Arrays.toString(arr));

    }


    static void merge(int arr[], int start, int middle, int end) {
    	int p1 = middle - start + 1;
        int p2 = end - middle;
        
        int[] left = new int[p1];
        int[] right = new int[p2];
        
        for (int i = 0; i < p1; i++) {
            left[i] = arr[start + i];
        }
        for (int i = 0; i < p2; i++) {
            right[i] = arr[middle + 1 + i];
        }
        
        int i = 0, j = 0, k = start;
        
        while (i < p1 && j < p2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        
        while (i < p1) {
            arr[k++] = left[i++];
        }

        while (j < p2) {
            arr[k++] = right[j++];
        }
        
    }
 
    
    static void mergeSort(int arr[], int start, int end) {
    	if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

}

package com.bptn.course.week1;

public class FindOddPosInArray {

	public static void main(String[] args) {
		int[] input = {10, 20, 30, 40, 50};
		
		
		for (int i = 1; i < input.length; i = i + 2 ) {
			System.out.println(input[i]);
		}

	}

}

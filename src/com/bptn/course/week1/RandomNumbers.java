package com.bptn.course.week1;
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int randomNumber = 2000;
		randomNumber = rand.nextInt(randomNumber);
		
		System.out.println(randomNumber);
	}

}

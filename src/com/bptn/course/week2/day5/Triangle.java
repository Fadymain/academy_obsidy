package com.bptn.course.week2.day5;
import java.util.Scanner;

public class Triangle {
	
// Write perimeterCalculator method 
	public int perimeterCalculator(int a, int b, int c) {
		return a + b + c;
	}
    

    // Write areaCalculator method
	public int areaCalculator(int a, int b) {
		return (a*b) / 2;
	
	}
	

    // Do not modify the code below:
    public static void main (String[]args){

		Triangle object = new Triangle();

		int a = 7;
        int b = 10;
        int c = 35;

        int perimeter = object.perimeterCalculator(a,b,c);
        int area = object.areaCalculator(7,10);

        System.out.println("Perimeter of the triangle is: " + perimeter + "\nThe Area of the Triangle is: " + area);
    }

}

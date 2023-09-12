package com.bptn.course.week4.day1.StudentSearch;

public class Student {
	
	int rollNumber;
	String name;

     public Student(int rollNumber, String name) {
    	 this.rollNumber = rollNumber;
    	 this.name = name;
     }

	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

}

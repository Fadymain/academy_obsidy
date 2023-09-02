package com.bptn.course.week2.day1.four_in_row;

public class ColumnFullException extends Exception {
	
	public ColumnFullException() {
		super("The column is full");
	}
	
	public ColumnFullException(String message) {
		super(message);
	}

}

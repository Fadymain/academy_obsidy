package com.bptn.course.week4.day1.bookTest;

public class Book {
	
	String title;
	double price;
	
	
	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}


	public String getTitle() {
		return title;
	}


	public String getBookInfo() {
		return title + "-" + price;
	}
	

}

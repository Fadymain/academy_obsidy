package com.bptn.course.week4.day1.bookTest;

public class Textbook extends Book {
	
	int edition;
	
	public Textbook(String title, double price, int edition) {
		super(title, price);
		this.edition = edition;
	}
	
	@Override 
	public String getBookInfo() {
		String newInfo = super.getBookInfo();
		return newInfo + "-" + edition;
	}

	public int getEdition() {
		return edition;
	}
	
	public boolean canSubstituteFor(Textbook other) {
		return (this.edition >= other.getEdition()) && this.title.equals(other.getTitle());
	}
}

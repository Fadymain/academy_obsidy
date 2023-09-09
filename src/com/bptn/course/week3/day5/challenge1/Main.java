package com.bptn.course.week3.day5.challenge1;

public class Main {
	
	public static void main(String[] args) {
	    Store store = new Store();
	    try {
	        store.purchase("apple",11);
	        System.out.println("Purchase successful!");
	    } catch (OutOfStockException e) {
	        System.out.println(e.getMessage());
	    }
	}

}

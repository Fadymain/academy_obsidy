package com.bptn.course.week3.day5.challenge1;
import java.util.HashMap;
import java.util.Map;

public class Store {
	
// create the map instance variable
	private Map<String, Integer> products;
    
    public Store() {
          
        products = new HashMap<>();
        
       products.put("apple", 10);
       products.put("banana", 5);
       products.put("orange", 0);
       
       }

    public void purchase(String product, int quantity) throws OutOfStockException {

    	if (!products.containsKey(product)){
        	throw new OutOfStockException("Product " + product + " not available in store");
        }
    	
        if (quantity > products.get(product)){
        	throw new OutOfStockException("Product " + product + " out of stock");
        }
    }

}

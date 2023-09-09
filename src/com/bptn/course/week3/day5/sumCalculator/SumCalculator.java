package com.bptn.course.week3.day5.sumCalculator;

public class SumCalculator extends Thread{
	
    private int start;
    private int end;
    private int sum;

    
    public SumCalculator(int start, int end) {
    	this.start = start;
    	this.end = end;
    	this.sum = 0;
        
    }

    @Override
    public void run() {
        
       for (int i = start; i <= end; i++) {
    	   sum += i;
       }
    }

    // Method to get the sum of the numbers in the range
    public int getSum() {
        return sum;
    }

}

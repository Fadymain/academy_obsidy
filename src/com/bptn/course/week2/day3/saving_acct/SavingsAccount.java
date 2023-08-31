package com.bptn.course.week2.day3.saving_acct;

public class SavingsAccount extends Account {
	
	//declare instance variable
	private double interest;

    //add parameterized constructor - use super keyword to call parent constructor
	public SavingsAccount(String name, double balance, double i) {
		super(name, balance);
		this.interest = i;
	}

    //override the toString method
	public String toString() {
    	return super.toString() + ", " + interest;
    }

    //override the equals method
	public boolean equals(Object other) {
		if (this == other) {
            return true;
        }

        if (other == null || getClass() != other.getClass()) {
            return false;
        }

        if (!super.equals(other)) {
            return false;
        }
		SavingsAccount otherAccount = (SavingsAccount) other;
	return Double.compare(otherAccount.interest, interest) == 0;
	}

}

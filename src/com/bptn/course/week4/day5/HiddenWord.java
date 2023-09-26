package com.bptn.course.week4.day5;

public class HiddenWord {

	

	    String hiddenWord;

	    public HiddenWord(String word) {
	    	this.hiddenWord = word;
	    }

	    public String getHint(String guess) {
	    	StringBuilder hint = new StringBuilder();
	    	
	    	for(int i = 0; i < hiddenWord.length(); i++) {
	    		char hiddenChar = hiddenWord.charAt(i);
	    		char guessedChar = guess.charAt(i);
	    		
	    		if (hiddenChar == guessedChar) {
	    			hint.append(hiddenChar);
	    		} else if (hiddenWord.contains(String.valueOf(guessedChar))){
	    			hint.append("+");
	    		} else {
	    			hint.append("*");
	    		}
	    	}
	    	return hint.toString();
	    }

	    
	    public static void main(String[] args) {
	        HiddenWord puzzle = new HiddenWord("HARPS");
	        System.out.println(puzzle.getHint("AAAAA") + " it should print +A+++");
	        System.out.println(puzzle.getHint("HELLO") + " it should print H****");
	        System.out.println(puzzle.getHint("HEART") + " it should print H*++*");
	        System.out.println(puzzle.getHint("HARMS") + " it should print HAR*S");
	        System.out.println(puzzle.getHint("HARPS") + " it should print HARPS");

	    } // end of main

	} // end of class

	

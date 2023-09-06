package com.bptn.course.week2.day1.four_in_row;
import java.util.Scanner;

public class Player {
	
	private String name;
	private String playerNumber;
	private String tokenColor;
	private String tokenShape;
    

   
    public String getTokenColor() {
		return tokenColor;
	}



	public void setTokenColor(String tokenColor) {
		this.tokenColor = tokenColor;
	}



	public String getTokenShape() {
		return tokenShape;
	}



	public void setTokenShape(String tokenShape) {
		this.tokenShape = tokenShape;
	}


	private static Scanner scanner = new Scanner(System.in);// complete line

    public Player(String name, String playerNumber) {
    	this.name = name;
    	this.playerNumber = playerNumber;
    }

    
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(String playerNumber) {
		this.playerNumber = playerNumber;
	}
    

    public int makeMove() {
        System.out.println("Make your move. What column do you want to put a token in?");
        
        int column = scanner.nextInt();
        return column;
    }


	public String toString() {
        return ("Player " + playerNumber + " is " + name);
    }
	
}

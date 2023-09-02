package com.bptn.course.week2.day1.four_in_row;

public class TestClass {
	
	public static void main(String[] args) {
		Player[] players = new Player[2];
	    Board board = new Board();

	    players[0] = new Player("Player 1", "1");
	    players[1] = new Player("Player 2", "2");
	    
        Game fourInARowGame = new Game(players, board);// complete line;
        fourInARowGame.play();
    }

}

package com.bptn.course.week2.day1.four_in_row;
import java.util.Scanner;

public class Game {
	
	private Player[] players;
    private Board board;
    private static Scanner scanner = new Scanner(System.in);

    public Game(Player[] players, Board board) {
        
        this.players = players; 
        this.board = board; 
        board = new Board();
    }

    public void setUpGame() {
        System.out.println("Enter player 1's name: ");
        players[0] = new Player(scanner.nextLine(), "1");
        
        String playerTwoName;
        
        do {
        	
        	System.out.println("Enter player 2's name: ");
        	playerTwoName = scanner.nextLine();
        	
        	 if (playerTwoName.equals (players[0].getName())) {

        		 System.out.println("Error! Both Players cannot have the same name.");
          	   
             }
        } while (playerTwoName.equals (players[0].getName()));
        
        
       
        players[1] = new Player(playerTwoName, "2");

        
        board.boardSetUp();

        board.printBoard();
    }

    public void printWinner(Player player) {
        System.out.println(player.getName() + " is the winner");
    }

    public void playerTurn(Player currentPlayer) {
        int col = currentPlayer.makeMove();
        while (!board.addToken(col, currentPlayer.getPlayerNumber())) {
           System.out.println("Invalid, make another input");
           col = currentPlayer.makeMove();
        }
        board.printBoard();
    }

    public void play() {
        boolean noWinner = true;
        this.setUpGame();
        int currentPlayerIndex = 0;

        while (noWinner) {
            if (board.boardFull()) {
                System.out.println("Board is now full. Game Ends.");
                return;
            }

            Player currentPlayer = players[currentPlayerIndex];
            System.out.println("It is player " + currentPlayer.getPlayerNumber() + "'s turn. " + currentPlayer);
            playerTurn(currentPlayer);
            
            if (board.checkIfPlayerIsTheWinner(currentPlayer.getPlayerNumber())) {
                printWinner(currentPlayer);
                noWinner = false;
            } else {
                currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
            }
        }
    }
}
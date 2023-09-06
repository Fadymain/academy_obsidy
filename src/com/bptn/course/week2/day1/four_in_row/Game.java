package com.bptn.course.week2.day1.four_in_row;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Game {
	
	private Player[] players;
    private Board board;
    private static Scanner scanner = new Scanner(System.in);
    private Timer gameTimer;
    private int gameTimeInSeconds = 600;

    public Game(Player[] players, Board board) {
        
        this.players = players; 
        this.board = board; 
        board = new Board();
    }
    
    private void startGameTimer() {
        gameTimer = new Timer();
        gameTimer.schedule(new TimerTask() {
            public void run() {
                System.out.println("Game over! Time's up.");
                gameTimer.cancel();
            }
        }, gameTimeInSeconds * 1000); // Convert seconds to milliseconds
    }

    
 // Method to set up the game
    public void setUpGame() {
    	
    	System.out.println("How many players will be participating?");
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array to store player objects
        players = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Enter the name for Player " + (i + 1) + ":");
            String playerName = scanner.nextLine();
            String playerNumber = Integer.toString(i + 1);

            players[i] = new Player(playerName, playerNumber);
        }
        
        System.out.println("Select a win condition:");
        System.out.println("1. Standard (4 in a row)");
        System.out.println("2. Custom (Enter your own win condition)");
        int winConditionChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        if (winConditionChoice == 2) {
            System.out.println("Enter the desired win condition (e.g., 5 in a row):");
            board.setWinCondition(scanner.nextInt());
            scanner.nextLine(); // Consume newline character
        }

        // Set up the game board
        board.boardSetUp();
        board.printBoard();
        startGameTimer();
        
        //Allow players to customize their tokens during setup:
        for (Player player : players) {
            System.out.println(player.getName() + ", customize your token:");
            System.out.print("Color: ");
            player.setTokenColor(scanner.nextLine());
            System.out.print("Shape: ");
            player.setTokenShape(scanner.nextLine());
        }
    }

    public void printWinner(Player player) {
        System.out.println(player.getName() + " is the winner");
    }

    
    // Method to handle a player's turn
    public void playerTurn(Player currentPlayer) {
        int col = currentPlayer.makeMove();
        try {
			while (!board.addToken(col, currentPlayer.getPlayerNumber())) {
				System.out.println("Invalid, make another input");
				col = currentPlayer.makeMove();
			} 
		} catch (ColumnFullException e) {
			System.out.println("Column is full. Please choose another column.");
		}
		board.printBoard();
    }

    
    // Method to start and manage the game
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
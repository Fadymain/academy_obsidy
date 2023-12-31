package com.bptn.course.week2.day1.four_in_row;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Board {
	private String[][] board;
	private int winCondition = 4;
	static Scanner scanner = new Scanner(System.in);
	
	private List<Integer> playerMoves = new ArrayList<>();
	
	public void setWinCondition(int condition) {
        this.winCondition = condition;
    }
	
	public void undoLastMove() {
	    if (!playerMoves.isEmpty()) {
	        int col = playerMoves.remove(playerMoves.size() - 1);
	        
	        // Find the row where the token was placed in the specified column
	        int rowToRemoveToken = board.length - 1;
	        while (rowToRemoveToken >= 0 && board[rowToRemoveToken][col].equals("-")) {
	            rowToRemoveToken--;
	        }
	        
	        if (rowToRemoveToken >= 0) {
	            board[rowToRemoveToken][col] = "-"; // Revert the cell to its initial state
	        }
	        
	        // Optionally, you can print the board after undoing the move
	        System.out.println("Undo: Removed token from column " + col);
	        printBoard();
	    }
	}

	
	// Method to set up the game board
	public void boardSetUp() {
        
		System.out.println("------ Board Set up -------");
		
        System.out.println("Number of rows: ");
        int rows = scanner.nextInt();// receive user input
        
        System.out.println("Number of cols: ");
        int cols = scanner.nextInt();
        
        this.board = new String[rows][cols];

        for (String[] row : board) {
            Arrays.fill(row, "-");
        }
        
       
    }

	
	// Method to print the current state of the game board
    public void printBoard() {
        for (String[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

    public boolean columnFull(int col) {
        if (board[0][col].equals("-")) {
            return false;
        }
        return true;
    }

    public boolean boardFull() {
        // True understanding this code.
        for (int i = 0; i < this.board[0].length; i++) {
            if (!columnFull(i)) {
                return false;
            }
        }
        return true; // Board is full
    }

    public boolean addToken(int colToAddToken, String token) throws ColumnFullException {
        int rowToAddToken = board.length - 1;

        while (rowToAddToken >= 0 && board[rowToAddToken][colToAddToken].equals("-"))  {
        	rowToAddToken--;
        }
        
            if (rowToAddToken + 1 < board.length) {
               board[rowToAddToken + 1][colToAddToken] = token;
               playerMoves.add(colToAddToken);
                return true;
            } else {
            	throw new ColumnFullException("Column " + colToAddToken + " is full.");
            }
    }

    public boolean checkIfPlayerIsTheWinner(String playerNumber) {
        if (checkHorizontal(playerNumber)) {
            return true;
        } else if (checkLeftDiagonal(playerNumber)) {
            return true;
        }
        return false; // Player has not won yet
    }
    
    // Method to check for a vertical win
    public boolean checkVertical(String playerNumber) {
        for (int col = 0; col < board[0].length; col++) {
            // length - 3 here because we are comparing 4 in a row items
            for (int row = 0; row < board.length - 3; row++) {
                if (board[row][col].equals(playerNumber)) {
                    if (board[row][col] == board[row + 1][col]
                            && board[row][col] == board[row + 2][col]
                            && board[row][col] == board[row + 3][col]) {
                        return true;
                    }
                }
            }
        }

        return false;

    }

    
    // Method to check for a horizontal win
    public boolean checkHorizontal(String playerNumber) {
    	for (int col = 0; col < board[0].length; col++) {
            for (int row = 0; row < board.length; row++) {
                if (board[row][col].equals(playerNumber)) {
                    int count = 1;
                    for (int i = 1; i < winCondition; i++) {
                        if (col + i < board[0].length && board[row][col + i].equals(playerNumber)) {
                            count++;
                        } else {
                            break;
                        }
                    }
                    if (count >= winCondition) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

     public boolean checkLeftDiagonal(String playerNumber) {
        for (int row = 0; row < board.length - 3; row++) {
            for (int col = 0; col < board[0].length - 3; col++) {
                if (board[row][col].equals(playerNumber)) {
                    if (board[row][col] == board[row + 1][col + 1]
                            && board[row][col] == board[row + 2][col + 2]
                            && board[row][col] == board[row + 3][col + 3]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
     
     // Method to check for a right diagonal win
    public boolean checkRightDiagonal(String playerNumber) {
       for (int row = 0; row <= board.length -4; row++) {
    	   for (int col = 3; col < board[0].length; col++) {
    		   if (board[row][col].equals(playerNumber)
                       && board[row][col].equals(board[row + 1][col - 1])
                       && board[row][col].equals(board[row + 2][col - 2])
                       && board[row][col].equals(board[row + 3][col - 3])) {
    			   return true;
    		   }
    	   }
       }
       return false;
    }

    // TODO: Uncomment this to test your board class in isolation. 
    // This is just a small set of tests for our board class for now. We will
    // delete this when we have the TestClass and Game class created.
    // We should have only one "main" method in the program at the end of the entire
    // challenge otherwise Java will freak out if there are multiple main classes in
    // the different classes it looks into.
    // A main method acts as the Java entry point into your program and Java expects
    // only one entry point.
    
    //Uncomment below to see if you've done the job:
     public static void main(String[] args) {
         try {
			Board board1 = new Board();
			board1.boardSetUp();
			board1.printBoard();
			board1.addToken(0, "x");
			board1.addToken(0, "x");
			board1.addToken(0, "x");
			board1.addToken(1, "y");
			board1.addToken(1, "z");
			board1.addToken(1, "w");
			board1.addToken(0, "x");
			System.out.println("Board for testing checkVertical");
			System.out.println("Board 1 check vertical with x returns -> " + board1.checkVertical("x"));
			System.out.println("Board 1 check vertical with y returns -> " + board1.checkVertical("y"));
			board1.printBoard();
			Board board2 = new Board();
			// Test with at least a 4-by-4 size board.
			board2.boardSetUp();
			board2.printBoard();
			board2.addToken(0, "x");
			board2.addToken(0, "x");
			board2.addToken(0, "w");
			board2.addToken(0, "w");
			board2.addToken(1, "y");
			board2.addToken(1, "x");
			board2.addToken(1, "w");
			board2.addToken(2, "y");
			board2.addToken(2, "w");
			board2.addToken(2, "x");
			board2.addToken(3, "w");
			board2.addToken(3, "w");
			board2.addToken(3, "w");
			board2.addToken(3, "x");
			System.out.println("Board for testing diagonals");
			System.out.println("Board 2 check right diagonal with x returns -> " + board2.checkRightDiagonal("x"));
			System.out.println("Board 2 check right diagonal y returns -> " + board2.checkRightDiagonal("y"));
			System.out.println("Board 2 check left diagonal w returns -> " + board2.checkLeftDiagonal("w"));
			board2.printBoard();
		} catch (ColumnFullException e) {
			System.out.println("Column is full. Please choose another column.");
	        e.printStackTrace();
		} finally {			
			scanner.close();
		}
     }
}

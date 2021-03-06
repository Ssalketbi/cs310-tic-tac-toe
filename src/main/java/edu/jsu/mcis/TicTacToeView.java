package edu.jsu.mcis;

import java.util.Scanner;

public class TicTacToeView {
    
    private final Scanner keyboard;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView() {
        
        /* Initializes scanner (for console keyboard) */
        
        keyboard = new Scanner(System.in);
        
    }
	
    public TicTacToeMove getNextMove(boolean isXTurn) {
        
        /* Prompts the player to enter the row and the column of their next move.
           Returns as a TicTacToeMove object. */
		   
        System.out.println();
	if(isXTurn) {
            System.out.println("Player 1 (X) move:");
        }
        else{
            System.out.println("Player 2 (O) move:");
        }
        System.out.print("Enter the row and column numbers, separated by a space: ");
        int row = keyboard.nextInt();
        int col = keyboard.nextInt();
        TicTacToeMove move = new TicTacToeMove(row, col);
		
        return move;

    }

    public void showInputError() {

        System.out.println("Entered location is invalid, already marked, or out of bounds.");

    }

    public void showResult(String r) {

        System.out.println(r + "!");

    }
    
    public void showBoard(String board) {
        
        System.out.println("\n\n" + board);
        
    }
	
}
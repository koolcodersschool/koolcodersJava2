package day8;

import java.util.Scanner;

public class TicTacToeGame {

	public static void main(String[] args) {

		char[][] gameBoard = { 
				{ ' ', '|', ' ', '|', ' ' }, 
				{ '-', '+', '-', '+', '-' }, 
				{ ' ', '|', ' ', '|', ' ' },
				{ '-', '+', '-', '+', '-' }, 
				{ ' ', '|', ' ', '|', ' ' } 
		};
		printGameBoard(gameBoard);

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter player's position: ");
		int playersPosition = keyboard.nextInt();
		
		placements(playersPosition, gameBoard, "player");
		
		printGameBoard(gameBoard);

	}

	public static void printGameBoard(char[][] gameBoard) {
		for (char[] row : gameBoard) {
			for (char column : row) {
				System.out.print(column);
			}
			System.out.println();
		}
	}

	public static void placements(int position, char[][] gameBoard, String user) {
		char symbol = ' ';
		if(user.toLowerCase().equals("player")) {
			symbol = 'X';
		}else if(user.toLowerCase().equals("computer")) {
			symbol = 'O';
		}
		
		
		switch (position) {
		case 1:
			gameBoard[0][0] = symbol;
			break;
		case 2:
			gameBoard[0][2] = symbol;
			break;
		case 3:
			gameBoard[0][4] = symbol;
			break;
		case 4:
			gameBoard[2][0] = symbol;
			break;
		case 5:
			gameBoard[2][2] = symbol;
			break;
		case 6:
			gameBoard[2][4] = symbol;
			break;
		case 7:
			gameBoard[4][0] = symbol;
			break;
		case 8:
			gameBoard[4][2] = symbol;
			break;
		case 9:
			gameBoard[4][4] = symbol;
			break;
		default:
			System.out.println("There is NOT such a position: " + position);
		}
	}

}

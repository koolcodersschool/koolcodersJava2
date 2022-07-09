package day8_9_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
	
	static List<Integer> playersPos = new ArrayList<>();
	static List<Integer> computersPos = new ArrayList<>();

	public static void main(String[] args) {

		char[][] gameBoard = { 
				{ ' ', '|', ' ', '|', ' ' }, 
				{ '-', '+', '-', '+', '-' }, 
				{ ' ', '|', ' ', '|', ' ' },
				{ '-', '+', '-', '+', '-' }, 
				{ ' ', '|', ' ', '|', ' ' } 
		};
		printGameBoard(gameBoard);
		
		while(true) {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter player's position: ");
			int playersPosition = keyboard.nextInt();
			
			while(playersPos.contains(playersPosition) || computersPos.contains(playersPosition)) {
				System.out.println("Position is taken. Please enter different position!!!");
				playersPosition = keyboard.nextInt();
			}
			
			placements(playersPosition, gameBoard, "player");
			
			String checkWinner = winningPositions();
			if(checkWinner.length() > 0) {
				System.out.println(checkWinner);
				break;
			}
			
			Random randomNumber = new Random();
			int computersPosition = randomNumber.nextInt(9) + 1;
			
			while(playersPos.contains(computersPosition) || computersPos.contains(computersPosition)) {
				System.out.println("Position is taken. Please enter different position!!!");
				computersPosition = randomNumber.nextInt(9) + 1;
			}
			
			placements(computersPosition, gameBoard, "computer");
			
			checkWinner = winningPositions();
			if(checkWinner.length() > 0) {
				System.out.println(checkWinner);
				break;
			}
			
			printGameBoard(gameBoard);
			
		}
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
			playersPos.add(position);
		}else if(user.toLowerCase().equals("computer")) {
			symbol = 'O';
			computersPos.add(position);
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
	
	
	public static String winningPositions() {
		List<Integer> topRow = new ArrayList<>(Arrays.asList(1,2,3));
		List<Integer> middleRow = new ArrayList<>(Arrays.asList(4,5,6));
		List<Integer> bottomRow = new ArrayList<>(Arrays.asList(7,8,9));
		List<Integer> firstColumn = new ArrayList<>(Arrays.asList(1,4,7));
		List<Integer> secondColumn = new ArrayList<>(Arrays.asList(2,5,8));
		List<Integer> thirdColumn = new ArrayList<>(Arrays.asList(3,6,9));
		List<Integer> cross1 = new ArrayList<>(Arrays.asList(1,5,9));
		List<Integer> cross2 = new ArrayList<>(Arrays.asList(3,5,7));
		
		List<List<Integer>> winningList = new ArrayList<>();
		winningList.add(topRow);
		winningList.add(middleRow);
		winningList.add(bottomRow);
		winningList.add(firstColumn);
		winningList.add(secondColumn);
		winningList.add(thirdColumn);
		winningList.add(cross1);
		winningList.add(cross2);
		
		for(List<Integer> eachList : winningList) {
			if(playersPos.containsAll(eachList)) {
				return "Congratulations you won!!!";
			}else if(computersPos.containsAll(eachList)) {
				return "Computer won. Sorry :(";
			}else if(playersPos.size() + computersPos.size() == 9) {
				for(List<Integer> eachWinList:winningList) {
					if(playersPos.containsAll(eachWinList)) {
						return "Congratulations you won!!!";
					}else if(computersPos.containsAll(eachWinList)) {
						return "Computer won. Sorry :(";
					}
				}
				return "TIE";
				
			}
		}
		
		return "";
	}

}

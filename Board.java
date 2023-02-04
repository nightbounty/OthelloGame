package Othello;

import java.util.Scanner;

public class Board {
	Scanner scan= new Scanner(System.in);
	public char grid[][] = new char[8][8];    
	static char playerSymbol[] = {'B','W'};
	public Board(String positions) {


	}
	public void printBoard() {  
		System.out.println();
		System.out.println("  a b c d e f g h  ");

		for (int i = 0; i < 8; i++) {
			System.out.print((i+1) + " ");

			for (int j = 0; j < 8; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println(i+1);
		}
		System.out.println("  a b c d e f g h  \n");
	} 



	public void drawBoard() {
		System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("\n\nChoose a starting position(1.1, 1.2, 1.3, 1.4 or 2):");
		System.out.println("1.1");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				grid[i][j] = '-';
			}
		}
		grid[2][2] = grid [3][3] = 'W';
		grid[3][2] = grid [2][3] = 'B';


		grid[7][3]=grid[7][4] = '*';

		System.out.println();

		System.out.println("  a b c d e f g h  ");

		for (int i = 0; i < 8; i++) {
			System.out.print((i+1) + " ");

			for (int j = 0; j < 8; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println(i+1);
		}
		System.out.println("  a b c d e f g h  \n");


		System.out.println("1.2");
		//1-2
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				grid[i][j] = '-';
			}
		}
		grid[2][4] = grid [3][5] = 'W';
		grid[3][4] = grid [2][5] = 'B';


		grid[7][3]=grid[7][4] = '*';

		System.out.println();

		System.out.println("  a b c d e f g h  ");

		for (int i = 0; i < 8; i++) {
			System.out.print((i+1) + " ");

			for (int j = 0; j < 8; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println(i+1);
		}
		System.out.println("  a b c d e f g h  \n");


		System.out.println("1.3");

		//1-3
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				grid[i][j] = '-';
			}
		}
		grid[4][2] = grid [5][3] = 'W';
		grid[4][3] = grid [5][2] = 'B';


		grid[7][3]=grid[7][4] = '*';

		System.out.println();

		System.out.println("  a b c d e f g h  ");

		for (int i = 0; i < 8; i++) {
			System.out.print((i+1) + " ");

			for (int j = 0; j < 8; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println(i+1);
		}
		System.out.println("  a b c d e f g h  \n");


		System.out.println("1.4");

		//1-4
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				grid[i][j] = '-';
			}
		}
		grid[4][4] = grid [5][5] = 'W';
		grid[4][5] = grid [5][4] = 'B';


		grid[7][3]=grid[7][4] = '*';

		System.out.println();

		System.out.println("  a b c d e f g h  ");

		for (int i = 0; i < 8; i++) {
			System.out.print((i+1) + " ");

			for (int j = 0; j < 8; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println(i+1);
		}
		System.out.println("  a b c d e f g h  \n");



		System.out.println("2");

		// 2 Standard
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				grid[i][j] = '-';
			}
		}
		grid[3][3] = grid [4][4] = 'W';
		grid[3][4] = grid [4][3] = 'B';


		grid[7][3]=grid[7][4] = '*';

		System.out.println();

		System.out.println("  a b c d e f g h  ");

		for (int i = 0; i < 8; i++) {
			System.out.print((i+1) + " ");

			for (int j = 0; j < 8; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println(i+1);
		}
		System.out.println("  a b c d e f g h  \n");


		// switch choosing position
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("\n\nChoose a starting position(1.1, 1.2, 1.3, 1.4 or 2):");
		Scanner scan = new Scanner(System.in);
		Boolean validation = true;
		while(validation) {

			switch(scan.next()){

			case "1.1":
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						grid[i][j] = '-';
					}
				}
				grid[2][2] = grid [3][3] = 'W';
				grid[3][2] = grid [2][3] = 'B';


				grid[7][3]=grid[7][4] = '*';

				System.out.println();

				System.out.println("  a b c d e f g h  ");

				for (int i = 0; i < 8; i++) {
					System.out.print((i+1) + " ");

					for (int j = 0; j < 8; j++) {
						System.out.print(grid[i][j] + " ");
					}
					System.out.println(i+1);
				}
				System.out.println("  a b c d e f g h  \n");

				validation = false;

				break;
			case "1.2":
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						grid[i][j] = '-';
					}
				}
				grid[2][4] = grid [3][5] = 'W';
				grid[3][4] = grid [2][5] = 'B';


				grid[7][3]=grid[7][4] = '*';

				System.out.println();

				System.out.println("  a b c d e f g h  ");

				for (int i = 0; i < 8; i++) {
					System.out.print((i+1) + " ");

					for (int j = 0; j < 8; j++) {
						System.out.print(grid[i][j] + " ");
					}
					System.out.println(i+1);
				}
				System.out.println("  a b c d e f g h  \n");
				validation = false;
				break;
			case "1.3":
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						grid[i][j] = '-';
					}
				}
				grid[4][2] = grid [5][3] = 'W';
				grid[4][3] = grid [5][2] = 'B';


				grid[7][3]=grid[7][4] = '*';

				System.out.println();

				System.out.println("  a b c d e f g h  ");

				for (int i = 0; i < 8; i++) {
					System.out.print((i+1) + " ");

					for (int j = 0; j < 8; j++) {
						System.out.print(grid[i][j] + " ");
					}
					System.out.println(i+1);
				}
				System.out.println("  a b c d e f g h  \n");
				validation = false;
				break;
			case "1.4":
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						grid[i][j] = '-';
					}
				}
				grid[4][4] = grid [5][5] = 'W';
				grid[4][5] = grid [5][4] = 'B';


				grid[7][3]=grid[7][4] = '*';

				System.out.println();

				System.out.println("  a b c d e f g h  ");

				for (int i = 0; i < 8; i++) {
					System.out.print((i+1) + " ");

					for (int j = 0; j < 8; j++) {
						System.out.print(grid[i][j] + " ");
					}
					System.out.println(i+1);
				}
				System.out.println("  a b c d e f g h  \n");

				validation = false;
				break;
			case "2":
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						grid[i][j] = '-';
					}
				}
				grid[3][3] = grid [4][4] = 'W';
				grid[3][4] = grid [4][3] = 'B';


				grid[7][3]=grid[7][4] = '*';

				System.out.println();

				System.out.println("  a b c d e f g h  ");

				for (int i = 0; i < 8; i++) {
					System.out.print((i+1) + " ");

					for (int j = 0; j < 8; j++) {
						System.out.print(grid[i][j] + " ");
					}
					System.out.println(i+1);
				}
				System.out.println("  a b c d e f g h  \n");
				validation = false;
				break;

			default:
				System.out.println("Invalid choice, please enter a starting position(1.1, 1.2, 1.3, 1.4 or 2):");

			}	
		}







	}

	public void updateBoard(int row, int column, int currentPlayerIndex, int otherPlayerIndex) {
		char currentPlayer = playerSymbol[currentPlayerIndex];
		char otherPlayer = playerSymbol[otherPlayerIndex];

		if((row < 0) && (row > 7) && (column < 0) && (column > 7)) {
			System.out.println("Error in updating the board.");
			return;
		}

		grid[row][column] = currentPlayer;

		//Down (South)
		if ((row+1 < 7) && (grid[row+1][column] == otherPlayer)) {  

			for (int i = 1; (grid[row+i][column] == otherPlayer) && (row+i <= 6);) {
				++i;
				if(grid[row+i][column]== currentPlayer) {
					for (int j = 1; (grid[row+j][column] == otherPlayer) && (row+j <= 6); j++) {
						grid[row+j][column] = currentPlayer;    
					}
					break;
				}
			}          
		}
		//Up (North)
		if ((row-1 > 0) && (grid[row-1][column] == otherPlayer)) {  

			for (int i = 1; (grid[row-i][column] == otherPlayer) && (row-i >= 1); ) {
				++i;
				if(grid[row-i][column]== currentPlayer) {
					for (int j = 1; (grid[row-j][column] == otherPlayer) && (row-j >= 1); j++) {
						grid[row-j][column] = currentPlayer;
					}
					break;
				}
			}            
		}
		//Right (East)
		if ((column+1 < 7) && (grid[row][column+1] == otherPlayer)) {  

			for (int i = 1; (grid[row][column+i] == otherPlayer) && (column+i <= 6); ) {
				++i;
				if(grid[row][column+i]== currentPlayer) {
					for (int j = 1; (grid[row][column+j] == otherPlayer) && (column+j <= 6); j++) {
						grid[row][column+j] = currentPlayer;
					}
					break;
				}
			}            
		}
		//Left (West)
		if ((column-1 > 0) && (grid[row][column-1] == otherPlayer)) {  

			for (int i = 1; (grid[row][column-i] == otherPlayer) && (column-i >= 1); ) {
				++i;
				if(grid[row][column-i]== currentPlayer) {
					for (int j = 1; (grid[row][column-j] == otherPlayer) && (column-j >= 1); j++) {
						grid[row][column-j] = currentPlayer;
					}
					break;
				}
			}            
		}
		// (South-East)
		if ((row+1 < 7) && (column+1 < 7) && (grid[row+1][column+1] == otherPlayer)) {  

			for (int i = 1; (grid[row+i][column+i] == otherPlayer) && (row+i <= 6) && (column+i <= 6); ) {
				++i;
				if(grid[row+i][column+i]== currentPlayer) {
					for (int j = 1; (grid[row+j][column+j] == otherPlayer) && (row+j <= 6) && (column+j <= 6); j++) {
						grid[row+j][column+j] = currentPlayer;
					}
					break;
				}
			}            
		}
		// (North-West)
		if ((row-1 > 0) && (column-1 > 0) && (grid[row-1][column-1] == otherPlayer)) {  

			for (int i = 1; (grid[row-i][column-i] == otherPlayer) && (row-i > 0) && (column-i > 0); ) {
				++i;
				if(grid[row-i][column-i]== currentPlayer) {
					for (int j = 1; (grid[row-j][column-j] == otherPlayer) && (row-j <= 6) && (column-j <= 6); j++) {
						grid[row-j][column-j] = currentPlayer;
					}
					break;
				}
			}            
		}
		// (South-West)
		if ((row+1 < 7) && (column-1 > 0) && (grid[row+1][column-1] == otherPlayer)) {  

			for (int i = 1; (grid[row+i][column-i] == otherPlayer) && (row+i <= 6) && (column-i >= 1); ) {
				++i;
				if(grid[row+i][column-i]== currentPlayer) {
					for (int j = 1; (grid[row+j][column-j] == otherPlayer) && (row+j <= 6) && (column-j >= 1); j++) {
						grid[row+j][column-j] = currentPlayer;
					}
					break;
				}
			}            
		}
		// (North-East)
		if ((row-1 > 0) && (column+1 < 7) && (grid[row-1][column+1] == otherPlayer)) {  

			for (int i = 1; (grid[row-i][column+i] == otherPlayer) && (row-i >= 1) && (column+i <= 6); ) {
				++i;
				if(grid[row-i][column+i]== currentPlayer) {
					for (int j = 1; (grid[row-j][column+j] == otherPlayer) && (row-j >= 1) && (column+j <= 6); j++) {
						grid[row-j][column+j] = currentPlayer;
					}
					break;
				}
			}            
		}        
	}

	public boolean canPlay(int row, int column, int currentPlayerIndex, int otherPlayerIndex) {

		char currentPlayer = playerSymbol[currentPlayerIndex];
		char otherPlayer = playerSymbol[otherPlayerIndex];

		if (grid[row][column] != '-' ) {
			System.out.println("Invalid placement.  Pieces may only be placed on empty locations.");
			return false;
		}

		//Down (South)
		if ((row+1 < 7) && (grid[row+1][column] == otherPlayer)) {  

			for (int i = 1; (grid[row+i][column] == otherPlayer) && (row+i <= 6);) {
				++i;
				if(grid[row+i][column]== currentPlayer) {
					return true;
				}
			}          
		}
		//Up (North)
		if ((row-1 > 0) && (grid[row-1][column] == otherPlayer)) {  

			for (int i = 1; (grid[row-i][column] == otherPlayer) && (row-i >= 1); ) {
				++i;
				if(grid[row-i][column]== currentPlayer) {
					return true;
				}
			}            
		}
		//Right (East)
		if ((column+1 < 7) && (grid[row][column+1] == otherPlayer)) {  

			for (int i = 1; (grid[row][column+i] == otherPlayer) && (column+i <= 6); ) {
				++i;
				if(grid[row][column+i]== currentPlayer) {
					return true;
				}
			}            
		}
		//Left (West)
		if ((column-1 > 0) && (grid[row][column-1] == otherPlayer)) {  

			for (int i = 1; (grid[row][column-i] == otherPlayer) && (column-i >= 1); ) {
				++i;
				if(grid[row][column-i]== currentPlayer) {
					return true;
				}
			}            
		}
		// (South-East)
		if ((row+1 < 7) && (column+1 < 7) && (grid[row+1][column+1] == otherPlayer)) {  

			for (int i = 1; (grid[row+i][column+i] == otherPlayer) && (row+i <= 6) && (column+i <= 6); ) {
				++i;
				if(grid[row+i][column+i]== currentPlayer) {
					return true;
				}
			}            
		}
		// (North-West)
		if ((row-1 > 0) && (column-1 > 0) && (grid[row-1][column-1] == otherPlayer)) {  

			for (int i = 1; (grid[row-i][column-i] == otherPlayer) && (row-i > 0) && (column-i > 0); ) {
				++i;
				if(grid[row-i][column-i]== currentPlayer) {
					return true;
				}
			}            
		}
		// (South-West)
		if ((row+1 < 7) && (column-1 > 0) && (grid[row+1][column-1] == otherPlayer)) {  

			for (int i = 1; (grid[row+i][column-i] == otherPlayer) && (row+i <= 6) && (column-i >= 1); ) {
				++i;
				if(grid[row+i][column-i]== currentPlayer) {
					return true;
				}
			}            
		}
		// (North-East)
		if ((row-1 > 0) && (column+1 < 7) && (grid[row-1][column+1] == otherPlayer)) {  

			for (int i = 1; (grid[row-i][column+i] == otherPlayer) && (row-i >= 1) && (column+i <= 6); ) {
				++i;
				if(grid[row-i][column+i]== currentPlayer) {
					return true;
				}
			}            
		}        
		return false;
	}
	public boolean hasValidMove(int currentPlayerIndex, int otherPlayerIndex) {
		for (int i = 0; i < 8; i++) {

			for (int j = 0; j < 8; j++) {
				if (grid[i][j] == '-') {
					if (canPlay(i, j, currentPlayerIndex, otherPlayerIndex)) {
						return true;
					}
				}
			}
		}
		return false;

	}
	public void gameOver(String[] playerNames) {
		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (grid[i][j] == 'B') {
					count1 ++;                    
				}
				if (grid[i][j] == 'W') {
					count2 ++;                    
				}
			}
		}

		if(count1 < count2) {
			System.out.println(playerNames[1] + " wins.");
		}
		if(count1 > count2) {
			System.out.println(playerNames[0] + " wins.");
		}
		if(count1 == count2) {
			System.out.println("The game is a tie.");
		}
		System.out.println(playerNames[0] + " has " + count1 + " pieces.");
		System.out.println(playerNames[1] + " has " + count2 + " pieces.");
	}

	public void takeTurn(Player current) {

	}



}

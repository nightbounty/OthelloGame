package Othello;

public class PlayablePosition extends Position {
	char grid[][] = new char[8][8];
	public int currentPlayerIndex = 0;
	public int otherPlayerIndex = 1;
	int row = 0;
	int column = 0;  
	static char playerSymbol[] = {'B','W'};    

	@Override
	public Boolean canPlay() {
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




}

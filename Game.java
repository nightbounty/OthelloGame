package Othello;

import java.io.File;
import java.util.Scanner;

public class Game {
	static Scanner scan = new Scanner(System.in);
	Player p1, p2;
	public String[] players = {"1", "2"};
	public char grid[][] = new char[8][8]; 

	public Game(String p1Name, String p2Name){

		p1 = new Player(p1Name);
		p2 = new Player(p2Name);
	}

	public static void quit() {
		System.out.println("Thank you for your time. See you next time!");
		System.exit(0);
	}

	public String[] playerNames() {        

		//Ask user names
		System.out.println("\nStarting a New Game! Please enter player names.");
		System.out.println("Player 1: ");


		String p1Name = scan.next();
		System.out.println("Player 2: ");
		String p2Name = scan.next();


		System.out.print(p1Name + " is 'B'\n");
		System.out.print(p2Name+ " is 'W'");

		players[0] = p1Name;
		players[1] = p2Name;



		return players;               
	}
	public void start() {
		//get the new players names
		playerNames();


	}



	public static Board load() {
		System.out.println("Please enter the file name that you wish to load :");
		String filename = scan.next();

		try {

			File file = new File(filename);
			Scanner scan = new Scanner(file);

			while (scan.hasNextLine())


				System.out.println(scan.nextLine());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;


	}

	private boolean isValidNumber(char number) {
		return number >= '1' && number <= '8';
	}

	private boolean isValidCharacter(char letter) {
		letter = Character.toLowerCase(letter);
		return letter >= 'a' && letter <= 'h';
	}

	public void play(int[] rowColumn, int currentPlayerIndex) {

		String stringInput = new String();

		int row = 0;
		int column = 0;                        

		while(true) {
			System.out.println(players[currentPlayerIndex] + "'s turn. Enter a board position:"); 
			stringInput = scan.nextLine();

			if(stringInput.length() != 2) {               
				stringInput = "00";                       
			}

			char a = stringInput.charAt(0);
			char b = stringInput.charAt(1); 

			if ((isValidNumber(a) && isValidCharacter(b))  || (isValidCharacter(a) && isValidNumber(b))) {
				if(isValidCharacter(b)) {
					row = a - '1';
					column = Character.toLowerCase(b) - 'a';
					break;
				}
				else if(isValidCharacter(a)) {
					row = b - '1';
					column = Character.toLowerCase(a) -'a';
					break;
				}
				else{
					System.out.println("Error!");
					break;
				}
			}
			else {
				System.out.println("Please enter a single letter (A-H) and number (1-8) combination.");
				System.out.println("For example: 1A or a1");           
			}            
		}
		rowColumn[0] = row;
		rowColumn[1] = column;     
	}



	private void save() {

		try {
			  
            // Get the file
            File f = new File("save");
  
            
            if (f.createNewFile())
                System.out.println("File Saved");
           
        }
        catch (Exception e) {
            System.err.println(e);
        }
   
	
	 System.out.println("The game has been saved");


	 }

	
	public static void main(String[] args) {

		Board Board = new Board(null);
		PlayablePosition PlayablePosition = new PlayablePosition();



		Game Game = new Game(null, null);
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Othello Game Menu. Please select one of the following numeric options(1-3) :\n");
		System.out.println("1. Start a New Game");
		System.out.println("2. Quit");
		System.out.println("3. Load a Game");

		switch(scan.nextInt()) {
		case 1:

			String[] playerNames = Game.playerNames();         
			int currentPlayerIndex = 0;
			int otherPlayerIndex = 1;


			Board.drawBoard();

			int [] rowColumn = new int[2];                          

			while(true) {                                                                   
				
				
				//options
				
				
			 Boolean validation = true;
				while(validation) {
			  
			  System.out.println("\nWhat do you want to do ?(Input 1-2-3)");
				System.out.println("1. Save");
				System.out.println("2. Concede");
				System.out.println("3. Make a move");
				
				
				switch(scan.nextInt()) {
				
				case 1:
					Game.save();
					validation = false;
					break;
				case 2:
					Game.quit();
					validation = false;
					break;
				case 3:
					Game.play(rowColumn, currentPlayerIndex); 
					validation = false;
					
				default:
				System.out.println("Invalid choice, please Input 1, 2 or 3 :");

			}
			}	
		        

				if (Board.canPlay(rowColumn[0], rowColumn[1], currentPlayerIndex, otherPlayerIndex)) {       
					Board.updateBoard(rowColumn[0], rowColumn[1], currentPlayerIndex, otherPlayerIndex);          
					Board.printBoard();
				}
				else {
					System.out.println("Error, no valid position found.");
					continue;
				}

				if (Board.hasValidMove(otherPlayerIndex,currentPlayerIndex) == true) {      
					currentPlayerIndex = (currentPlayerIndex + 1) % 2;
					otherPlayerIndex = (otherPlayerIndex +1) % 2;
					continue;
				}
				else if (Board.hasValidMove(currentPlayerIndex, otherPlayerIndex) == true) {    
					System.out.println("No valid move for " + playerNames[otherPlayerIndex] + "; turn is skipped.");
					continue;
				}
				else {
					System.out.println("No remaining moves. Game Over.");
					break;
				}
			}
			Board.gameOver(playerNames);






		case 2:
			quit();

			break;
		case 3:
			Game.load();




			break;


		}











	}












	
	
	
}

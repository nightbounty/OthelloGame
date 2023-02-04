package Othello;

public abstract class Position {

	private char piece;
	public static final char UNPLAYABLE = '*';
	public static final char Empty = ' ';
	public static final char BLACK = 'B';
	public static final char WHITE = 'W';



	public abstract Boolean canPlay();

}

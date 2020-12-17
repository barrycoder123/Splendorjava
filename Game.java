import java.util.*;

public class Game {

	static String QUIT = "q";
	static String TAKE_3 = "p3";
	static String TAKE_2 = "p2";
	static String RESERVE = "r";
	static String PURCHASE = "p";
	static String PURCHASE_R = "pr";
	static int BOARD_HEIGHT= 41;
	static int BOARD_WIDTH = 120; 
	static int CARD_WIDTH = 13;
	static int CARD_HEIGHT = 8;
	static int CARD_ROWS = 3;
	static int CARD_COLS = 4;
	static int GEMS = 6;
	static String [] COLOR_ARRAY = {"white", "red","pink", "blue", "green", "yellow"}
	static char [] GAME_ROWS = {'v', 't', 'm'}; 
	static char [][] board = new char[BOARD_HEIGHT][BOARD_WIDTH];
	static String [][] board_color = new String [BOARD_HEIGHT][BOARD_WIDTH];

    Card grid[][] = new Card[CARD_ROWS][CARD_COLS]; 


	public Game(String fileName) {
		Player player_1 = new Player();
		Player player_2 = new Player();

	//Initialize The Board
	
	for(int i =0; i < BOARD_HEIGHT; i++){
		for(int j = 0; j <BOARD_WIDTH; j++){
			board[i][j] = ' ';
			board_color[i][j] = "white";
		}
	}

	init_gem_bank();
	init_data(fileName);
	init_grid();
	}

	//Main Game Loop
	
	public void playGame(){
		boolean game_over = false;
		boolean player1_turn = true;
		boolean game_over_p = false;
		

	}


    // private vars:
    private ArrayList<Card> mines = new ArrayList<Card>();
    private ArrayList<Card> transport = new ArrayList<Card>();
    private ArrayList<Card> vendors = new ArrayList<Card>();
    private Player player_1; 
    private Player player_2;
    private int gem_bank[] = new int[6];


}

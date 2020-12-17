public class Game {

	String QUIT = "q";
	String TAKE_3 = "p3";
	String TAKE_2 = "p2";
	String RESERVE = "r";
	String PURCHASE = "p";
	String PURCHASE_R = "pr";
	int BOARD_HEIGHT= 41;
	int BOARD_WIDTH = 120; 
	int CARD_WIDTH = 13;
	int CARD_HEIGHT = 8;
	int CARD_ROWS = 3;
	int CARD_COLS = 4;
	int GEMS = 6;
	String [] COLOR_ARRAY = {"white", "red","pink", "blue", "green", "yellow"}
	char [] GAME_ROWS = {'v', 't', 'm'}; 
	char [][] board = new char[BOARD_HEIGHT][BOARD_WIDTH];
	String [][] board_color = new String [BOARD_HEIGHT][BOARD_WIDTH];


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





}

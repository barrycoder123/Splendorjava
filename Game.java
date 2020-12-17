import java.util.Scanner;

public class Game {
	static Scanner sc = new Scanner(System.in);
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
		Player p;		

		while(!game_over){
			screen();
			while(sum_gems(player_1) > 10 || sum_gems(player_2) > 10){
				if(!player1_turn) over_10_full(player_1);
				else over_10_full(player_2);
			}
			p = player_1;
			instructions(game_over_p, p, player1_turn);
			player1_turn = !player1_turn;
		}
	}


	public void instructions(boolean game_over_p, p, boolean player1_turn){
		String player_move;
		
		if(player1_turn== true){
			System.out.println("PLAYER 1, enter your next move: ");
			p = player_1;
		} else {
			System.out.println("PLAYER 2, enter your next move: ");
			p = player_2;
		}


		player_move = sc.next();

		if(player_move == QUIT){
			game_over_p = true;
		} else if (player-move == TAKE_3) take_3_full(p);
		else if(player_move == TAKE_2){
			String gem;
			gem = sc.next();
			take_2(p,gem);
		} else if(player_move == RESERVE) reserve_full(p);
		else if(player_move == PURCHASE) purchase_full(p);
		else if(player_move == PURCHASE_R){
			int index;
			index = sc.next();
			purchase_reserve(p, index-1);
		}	
	
	}

	
	public void purchase_full(Player p){
		char card_type = sc.next();
		char col_index = sc.next();
		int y_pos = get_row(card_type);		
		reserve(p,y_pos,col_index-1);
	}
	
	public void reserve_full(Player p){
		char card_type = sc.next();
		col_index = sc.next();
		int y_pos = get_row(card_type);
		reserve(p, y_pos, col_index-1);
	}


	public void take_3_full (Player p){
		String gem1 = sc.next();
		String gem2 = sc.next();
		String gem3 = sc.next();

		String [] gems = {gem1, gem2, gem3};
		for(int i; i<3; i++) take_3(p, gems[i]);
}

	
	public int sum_gems(Player p){
		int sum = 0;
		for(int i = 0; i<6;i++){
			sum += p.getGemCount(i);
		}
		return(sum);
	}


	public void over_10(Player p){
		String gem_to_return = sc.next();
		int return_index = gem_index(gem_to_return);
		p.set_gem_count(-1, return_index);
		this.gem_bank[return_index]++; 
		clearBoard();
		screen_clear();
		screen_home();
		

	}

	
	public void 




}

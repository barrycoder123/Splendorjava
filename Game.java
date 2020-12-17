
import java.util.*;
import java.util.Scanner;

public class Game {
	static Scanner sc = new Scanner(System.in);
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

    // private vars:
    private ArrayList<Card> mines = new ArrayList<Card>();
    private ArrayList<Card> transport = new ArrayList<Card>();
    private ArrayList<Card> vendors = new ArrayList<Card>();
    private Player player_1; 
    private Player player_2;
    private int gem_bank[] = new int[6];


}

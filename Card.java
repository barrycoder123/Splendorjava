public class Card{

	private int value;
	private int [] price;
	private String gemColor;
	private char type;

	//Constructor

	public Card() {
		value = 0;
		for(int i; i < 5; i++){
			price[i] = 0;
			gemColor = "";	
		}
	
	//Acessors

	public int getPrice(int index){
		return(price[index]);
	}

	public int getValue(){
		return(value);
	}

	public String getGemColor(){
		return(gemColor);
	}

	public String getType(){
		return(type);
	}
	
	//Mutators 

	public void setPrice(int price, int index){
		this.price[index] = price;
	}

	public void setValue(int value){
		this.value = value;
	}

	public void setGemColor(String gemColor){
		this.gemColor = gemColor;
	}

	public void setType(char type)
		this.type = type;
	}







}

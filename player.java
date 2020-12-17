public class player {


    /*********************************************************************
     *                  Public Methods:
     * player() - constructor              
     * getReserve() - get's the reserved card at the index
     * getGemCount() - get's the amount of gem's a player has
     * totalValue() - returns the player's number of points
     * getDiscount() - returns the discount of a card
     * totalPurchases() - returns the number of purchases a player has made
     *
     * Each has it's own mutator functions
     * reset_reserves() - resets the modifed reserves deck
     ***********************************************************************/
    public player() {
        this.gem_total = 0;
        this.total_value = 0;

        for (int i = 0; i < 3; ++i) {
            this.reserver[i] = null;
        }
        
        for (int i = 0; i < 5; ++i) {
            this.discount[i] = 0;
        }
      
        for (int i = 0; i < 6; ++i) {
            this.gem_count[i] = 0;
        }
        
    }

    // acessors 

    public Card getReserve(int index) { 
        return reserve[index]; 
    }
    public int getGemCount(int index) { 
        return gem_count[index]; 
    }
    public int totalValue() { 
        return this.total_value; 
    }
    public int getDiscount(int index) { 
        return discount[index]; 
    }
    public int totalPurcahses() { 
        return total_purchases; 
    }
    
    // mutators
    
    public void setReserve(Card c, int index) { 
        this.reserve[index] = c; 
    }
    public void setGemCount(int gem_count_str, int index) { 
        this.gem_count[index] += gem_count_str; 
    }
    public void setTotalValue(int prestige_str) {
        this.total_prestige += prestige_str;
    }
    public void setTotalPurchases(int purchases) {
        this.totalPurchases += purchases;
    }
    public foid setDiscount(int discount_str, int index) {
        this.discount[index] += discount_str;
    }

    /*
     * Function: reset_reserves
     * Args:index [int]
     * Purpose: Moves around cards in the player reserves
     * erases card and shift other cards as needed
     */
    public void reset_reserves(int index) {
        if (index > 0) {
            if (reserve[index[ == null) {
                reset_reserves(index - 1);
            } else { 
                reset_reserves(index - 1);
                if (reserve[index -1[ == null) {
                    reserve[index - 1] = reserve[index];
                    reserve[index] = null;
                }
            }
        }
    }

    // private 

    private int gem_total;
    private Card[] reserves = new Card[3];
    private int total_value;
    private int total_purchases;
    private int discount = new int[5];
    private int gem_count = new int[6]
    
}

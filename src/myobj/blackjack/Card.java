package myobj.blackjack;


public class Card {
	public static final String[] suits = {"♠", "♣", "♥", "◆"};
	public static final String[] ranks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    
    private String suit;
    private String rank;
    
    
    public Card() {
       suit = suits[(int)(Math.random()*suits.length)];
       rank = ranks[(int)(Math.random()*ranks.length)];
    }
    
    public Card(String suit, String rank) {
		this.rank = rank;
		this.suit = suit;
	}

	// private로 되어있으니 접근하기 위해서..???
    public  String getsuit(){
    	return suit;
    }
    
    public String getRank() {
        return rank;
    }
    
    public int getCardValue() {
        // 각 숫자 카드의 값 반환 
        if (rank.equals("A")) {
            return 1;
        } else if (rank.equals("K") || rank.equals("Q") || rank.equals("J")) {
            return 10;
        } else {
            return Integer.parseInt(rank);
        }
    }
    
    @Override
    public String toString() {
    	return rank + suit;
    }
    
    
}
 // equals()와 hashCode() 메서드를 오버라이드하여 Set에서 중복을 체크할 수 있도록 함
 
//    @Override
//    public boolean equals(Object obj) {
//    	return this.hashCode() == obj.hashCode();
//    }
//    
//    @Override
//    public int hashCode() {  
//    	return  (rank + suit).hashCode();
//    }
    

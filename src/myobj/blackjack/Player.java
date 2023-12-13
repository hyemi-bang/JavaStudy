package myobj.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand = new ArrayList<>();
	private Rules rules;
	
	public Player() {
        this.rules = new Rules(hand);
    }


	public void drawCard(Card card) {
		hand.add(card);
		// 카드를 뽑아~ 말아~ 
		// 추가로 뽑게 되는 것은 메인에서 처리
	}
	
	public int calculateHandValue() {
        return rules.calculateHandValue();
    }
	
	public List<Card> getHand() {
	    return hand;
	}

	 public void displayHand() {
	        System.out.println("플레이어의 카드: " + hand);
	    }
		
	}



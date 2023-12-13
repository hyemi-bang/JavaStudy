package myobj.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards = new ArrayList<>();

	public Deck() { // 카드 초기화
		initialzeDeck();
		shuffleDeck();
		  System.out.println("Deck initialized with " + cards.size() + " cards.");
	}

	private void initialzeDeck() {// 모든 카드를 덱에 추가
		// Card 클래스의 suits 배열과 ranks 배열을 사용하여 모든 카드 조합을 만들어, 새로운 cards의 List에 추가해 둔다??
		for (String suit : Card.suits) {
			for (String rank : Card.ranks) {
				cards.add(new Card(suit, rank));
				// null 자리에 card suit, rank를 넣고 싶다.
				// 최종 > new Card(suit,rank) // Card 클래스에 기본생성자 만들음

			}
		}
	}

	private void shuffleDeck() {
		// 리스트<Card> 카드들 셔플
		Collections.shuffle(cards);

	}

	public Card drawCard() {
		return null;
		// 덱에서 카드를 하나씩 뽑고 뽑은 카드를 알려주고, 덱에서 제거해야한다.
		
	

	}


}
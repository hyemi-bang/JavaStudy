package myobj.blackjack2;

import java.util.Collections;
import java.util.List;

public class CardDeck {
	
	List<Card> cards;
	
	final private int shuffleCount;
	private int drawCount = 0; // 인스턴스가 생기는 시점에서 0으로 시작을 한다
	
	public CardDeck(List<Card> cards) {
		this.cards = cards;
		this.shuffleCount = cards.size(); 
		// 카드를 52장 받으면 셔플 카운트 52장이 될것이다
		shuffle();
	}
	
	// 섞는 기능
	public void shuffle() {
		Collections.shuffle(cards);
	}
	// 맨 위에서 뽑는 기능
	public Card draw() {
		if(drawCount == shuffleCount) {
			drawCount = 0;
			shuffle();
		}
		return cards.get(drawCount++); 
		// 삭제는 하지 않고 한 장씩 내려가면서 뽑은 다음에 drawCount == shuffleCount가 될 때 다시 한번 덱을 초기화시켜주는것
	}
	
	
//	public Card draw() {
//		if(cards.size() == 0) { 
//			return null;
//			// 모든 카드를 다 뽑으면 IndexOutOfBoundsException 에러가 나오니까 이렇게 if문으로 null 처리를 해주는데
//			// 우리가 메인에서 null이 나오면 다시 덱 섞어주고 하는게 번거로우니, 자동으로 섞은 덱을 나오게 해야한다.
//			// 그래서 shuffleCount, drawCount를 만들었다.
//		} else{
//			return cards.remove(0);
//		}
//	}

}

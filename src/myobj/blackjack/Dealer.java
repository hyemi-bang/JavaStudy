package myobj.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
	private List<Card> hand = new ArrayList<>();
	private Rules rules;

	public Dealer() {
		this.rules = new Rules(hand);
	}

	public void drawCard(Card card) {
		hand.add(card);
	}

	// 딜러 규칙
	public int calculateHandValue() {
		return rules.calculateHandValue();
	}

	// 딜러의 첫번째 카드만 보여준다
	public List<Card> getHand() {
		List<Card> showOffCard = new ArrayList<>(); // 보여주는 카드 리스트
		showOffCard.add(hand.get(0));// 추가해 손에있는 카드 0번째꺼
		return showOffCard;
	}

	public void displayHand() {
		System.out.println("딜러의 카드: " + hand);
	}

}

// 딜러는 의사 결정 할 수 없고 정해진 규칙에만 따라야 한다
// 가진 카드의 합이 16이하라면 뽑고, 17 이상이면 멈춘다
//	public boolean cardRules(int totalValue) {
//		return totalValue <= 16;
//	}
// 플레이어의 게임이 다 끝나면 규칙에 따라 뽑거나 멈춘다

//	public boolean dealerDrawCard(int playerTotalValue, int dealerTotalValue) {
//		// 플레이어의 카드합이 블랙잭
//		if (playerTotalValue == 21 && dealerTotalValue != 21) {
//			return false;
//		}
//		// 플레이어가 버스트가 아니면서, 딜러의 합계가 16 이하라면 더 뽑음
//		return playerTotalValue <= 21 && dealerTotalValue <= 16;
//	}

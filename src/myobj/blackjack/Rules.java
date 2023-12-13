package myobj.blackjack;

import java.util.List;

public class Rules {
	private List<Card> hand;
	
	public Rules() {
		// TODO Auto-generated constructor stub
	}

	public Rules(List<Card> hand) {
		this.hand = hand;
		// hand 리스트를 받아와서 클래스 내부의 hand 변수에 할당
	}

	public int calculateHandValue() {
		int totalValue = 0; // 카드의 합계를 저장하는 변수
		int numberOfA = 0; // A 는 1 또는 11

		// 손에 있는 각 카드의 값을 계산하여 합계에 더합니다.
		for (Card card : hand) { // hand 리스트에 있는 각각의 카드에 대해 반복
			int cardValue = card.getCardValue();
			if (cardValue == 1) { // A
				numberOfA++;
				totalValue += 11;
			} else if (cardValue > 10) { // Jack, Queen, King의 경우 10으로 계산
				totalValue += 10;
			} else {
				totalValue += cardValue;
			}
		}

		// A가 있고 합계가 21을 넘을 경우 A의 값을 1로 변경하여 버스트를 피합니다.
		while (totalValue > 21 && numberOfA > 0) {
			totalValue -= 10;
			numberOfA--;
		}

		return totalValue; // 최종적인 합계를 반환합니다.
	}
	
	 public static void determineWinner(int playerTotalValue, int dealerTotalValue) {
	        if (playerTotalValue > 21) {
	            System.out.println("플레이어 버스트! 딜러 승리!");
	        } else if (dealerTotalValue > 21) {
	            System.out.println("딜러 버스트! 플레이어 승리!");
	        } else if (playerTotalValue == dealerTotalValue) {
	            System.out.println("무승부!");
	        } else if (playerTotalValue > dealerTotalValue) {
	            System.out.println("플레이어 승리!");
	        } else {
	            System.out.println("딜러 승리!");
	        }
	    }

}

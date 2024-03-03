package quiz;

import java.util.Scanner;

import myobj.blackjack2.Card;
import myobj.blackjack2.CardDeck;
import myobj.blackjack2.Player;

public class D05_Blackjack_T {

	public static void main(String[] args) {
		CardDeck deck = Card.getDeck(3);
		
		//딜러 한장 가리고 있어야 하고, 하나씩 나눠줘야 하고 하니 이러한 객체를 가지고 있는 플레이어 클래스를 만들어 주면 좋을것 같다.
//		List<Card> player = new ArrayList<>();
//		List<Card> dealer = new ArrayList<>();
 		
		Player player = new Player("사용자");
		Player dealer = new Player("딜러");
		
		Scanner sc = new Scanner(System.in);
		
		player.addCard(deck.draw());
		dealer.addCard(deck.draw());
		player.addCard(deck.draw());
		dealer.addCard(deck.draw());				
		dealer.hide(0);
		
		while(true) {
			System.out.println(player);
			System.out.println("-- 사용자 --");
			player.showHands();
			System.out.println("사용자 패의 가치 : " + player.getHandValue());
			System.out.println("-- 딜러 --");
			dealer.showHands(); 
			
			System.out.println("1> Hit\n2> Stand ");
			int select = sc.nextInt();
			
			if(select == 1) {
				player.addCard(deck.draw());
				int value = player.getHandValue();
				if(value == -1 || value == 21) { // 버스트 또는 블랙잭일때 그만뽑고 나가라
					break;
				}
			} else if(select == 2) {
				break;
			} else {
				System.out.println("[Warning] 1번 혹은 2번 선택해주세요.");
			}
		}
		int playerHandValue = player.getHandValue();
		int dealerHandValue = dealer.getHandValue();
		
		if(playerHandValue == -1 ) {
			System.out.println();
			System.out.println("--사용자--");
			player.showHands();
			System.out.println("플레이어 버스트! 딜러의 승리");
			return;
		}
		
		// for문으로 만들었을때
//		for(int value = dealer.getHandValue(); value < 17 && value != -1; value = dealer.getHandValue()) {
//			dealer.addCard(deck.draw());
//		}
		
		int v;
		while ((v = dealer.getHandValue()) < 17 && v!= -1) {
			dealer.addCard(deck.draw());
			
			
		}
		
		dealer.open(0);

		System.out.println("##결과##");
		player.showHands();
		System.out.println("사용자 패의 가치 : " +playerHandValue);
		dealer.showHands();
		System.out.println("딜러 패의 가치 : " + dealerHandValue);
		
		if(dealerHandValue == -1 ) {
			System.out.println("딜러 버스트! 플레이어 승리");
		}
		if(playerHandValue == dealerHandValue) {
			System.out.println("무승부!");
		} else if (playerHandValue > dealerHandValue) {
			System.out.println("사용자 승리");
		} else if (playerHandValue < dealerHandValue) {
			System.out.println("딜러 승리");
		}
				
	}
}

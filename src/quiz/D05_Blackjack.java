package quiz;

import java.util.Scanner;

import myobj.blackjack.Card;
import myobj.blackjack.Dealer;
import myobj.blackjack.Deck;
import myobj.blackjack.Player;
import myobj.blackjack.Rules;

public class D05_Blackjack {
	/*
	# 블랙잭 진행되게 만들기
	
	1> 컴퓨터(딜러)와 사람(플레이어)가 카드를 뽑는다
		카드는 정해진 모양과 숫자 내에서 하나씩 뽑는것, 랜덤으로 섞어서 같은 모양과 숫자가 여러개 나오게 하면 안됨
		
	2> 처음에는 2장씩 받고, 딜러의 카드 1장은 가려놓는다 (플레이어 2장은 확인 할 수 있다)
	3> 플레이어는 받은 카드롤 보고 더 뽑을지(hit), 그만 뽑고 멈출지(Stand) 선택한다
	4> hit을 선택하면 플레이어만 카드 1장 더 받는다. 
	   stand를 선택하면 딜러가 가려놓은 카드를 오픈하고, 정해진 규칙에 따라 카드를 계속 뽑는다.
	   >> 딜러는 의사 결정 할 수 없고 정해진 규칙에만 따라야 한다
	   ※ 가진 카드의 합이 16이하라면 뽑고, 17 이상이면 멈춘다
	   
	5> J, Q, K는 모두 10
	   A 는 1 또는 11 (처음에는 11의 가치를 가지고 있다가 버스트를 당하면 1로 바뀔 수 있다)
	   카드 모양 : ♠ ♣ ♥ ◆
	   카드 숫자 : A, 2~10, J, Q, K
	   
	   
	6> 버스트 > 가진 카드의 합이 21이 넘었을때, 플레이어가 버스트 당하면 딜러는 카드를 뽑지 않고 승리
	   블랙잭 > 가진 카드의 합이 21일때 , 21이 되면 hit 불가능하고 딜러가 규칙에 따라 카드를 뽑는다.
	
	*/

	public static void main(String[] args) {

		Deck deck = new Deck();
		Player player = new Player();
		Dealer dealer = new Dealer();
		Rules rule = new Rules();

		// 초기에 카드를 2장씩 뽑음
		for (int i = 0; i < 2; i++) {
			Card card = new Card();
			player.drawCard(card);
			dealer.drawCard(card);
		}
		
		System.out.println("플레이어 카드 : " + player.getHand() + " 카드 합 : " + player.calculateHandValue());
		System.out.println("딜러 첫 번째 카드 : " + dealer.getHand());
		
		//카드 숫자가 21 이전일때 반복
		int playerTotalValue = player.calculateHandValue();
		while(playerTotalValue < 21) {
			Scanner sc = new Scanner(System.in);
			System.out.println("hit, stand 입력 >>");
			String answer = sc.next();
			
			if(answer.equals("hit")) {
				Card card = deck.drawCard();
				player.drawCard(card);
				playerTotalValue = player.calculateHandValue();
				System.out.println("현재 플레이어 카드 합 : " + playerTotalValue);
			} else if (answer.equals("stand")){
				break;
			}
			
		}
		// 딜러 규칙 : 16이하라면 뽑고, 17이상이면 뽑지 않는다.
		int dealerTotalValue = dealer.calculateHandValue();
		while(dealerTotalValue <= 16) {
			Card card = deck.drawCard();
			dealer.drawCard(card);
		}

//		System.out.println("딜러의 카드: " + dealer.displayHand());
		System.out.println("딜러의 현재 카드 합: " + dealerTotalValue);
		
		// 승패 결정
		rule.determineWinner(playerTotalValue, dealer.calculateHandValue());
	}
	
	 
    


}
//
//for (int i = 0; i < 2; i++) {
//    Card card = deck.drawCard();
//    player.drawCard(card);
//}
//int playerTotalValue = player.calculateHandValue();
//Scanner sc = new Scanner(System.in);
//System.out.println("hit, stand 입력>>");
//String answer = sc.next();
//
//if(answer.equals("hit")) {
//	player.drawCard(card1);
//} else {
//	Dealer.Dealer();// 딜러의 규칙에따라 진행
//}

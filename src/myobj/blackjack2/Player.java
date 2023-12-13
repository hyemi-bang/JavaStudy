package myobj.blackjack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player {

	List<Card> hands = new ArrayList<>();
	String name;
	int money;
	
	public Player(String name) { // 플레이어들 이름은 밖에서 정해줘야 할 것이다
		this(name, 2500); // 기본금액 2500원 으로 설정
	}
	
	public Player(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//카드 숨기는 기능 , 카드 자체에 안보이는 기능이 있어야 한다
	public void hide(int index) {
		hands.get(index).toBackSide(); // 카드 클래스에 만들어 놓은 메소드
	}
	
	public void open (int index) {
		hands.get(index).toFrontSide();  // 카드 클래스에 만들어 놓은 메소드
	}
	
	public void addCard(Card card) {
		hands.add(card);
	}
	
	public int getHandValue() {
		int value = 0;
		for(int i = 0; i < hands.size(); ++i) {
			Card c = hands.get(i);
			value += c.getRankValue();
		}
		
//		int aCount = 0;
		//A의 개수가 세어지지 않는 이유는 기본적으로 frequency는 equls를 가져다가 비교를 하는데,
		// 현재( 해쉬코드, 이퀄스 오버라이드전) 주소가 다르기때문에 몇개인지 알 수가 없는 것이다
		// 따라서 (해쉬코드, 이퀄스) 오버라이드 해주면 해결가능~
//		Collections.frequency(hands, A);
//		hands.contains(A);
		int aCount = Collections.frequency(hands, Card.SPADE_ACE);
		// Card class 비교대상을 하나 만들어 놓는다.
		// final public static Card SPADE_ACE = new Card(0,0);
		// System.out.println("aCount" + aCount); A가 몇개있는지 볼 수 있음
		
		while(value > 21 && aCount > 0) {
			value -=10;
			--aCount;
		}
		
		
		return (value > 21 ? -1 : value);
	}
	
	public void showHands() {
		System.out.println(hands);
	}
	
	public void addMoney(int money) {
		this.money += money;
	}
	
	public void loseMoney (int money) {
		this.money -= money;
	}
	
	@Override
	public String toString() {
		return String.format("%s [보유금액 : %d원]", name, money);
	}
	
}

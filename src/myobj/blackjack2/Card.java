package myobj.blackjack2;

import java.util.ArrayList;
import java.util.List;

public class Card {

	final private static char[] SUITS = { '♠', '♣', '♡', '◇' };
	final private static String[] RANKS = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	final private static int[] RANK_VALUES = { 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };
	// A는 11이고, JQK는 10이라는 것을 저장해 놓을 수 있다.

	final public static Card SPADE_ACE = new Card(0,0);
	// 비교대상으로 ♠A 카드를 하나 만들어놓는다
	
	private int suit;
	private int rank;
	private boolean reversed = false;
	// Player클래스를 만들고 카드에 앞 뒷면이 있구나 생각하고 나서 > 카드 클래스로 넘어온것임 처음에는 뒤집혀져 있지 않다
	// toFront~ , toBack~ 메서드 만들고, toString 오버라이드 내용 변경

	public Card(int suit, int rank) {
		this.rank = rank;
		this.suit = suit;
	}

	@Override
	// 카드가 보여질때 어떤 모양으로 보여질 것인가
	public String toString() {
		// return String.format("[%c%s]", SUITS[suit], RANKS[rank]);
		// = return"[" + SUITS[suit] + RANKS[rank] + "]";
		// return SUITS[suit] + RANKS[rank];
		if (reversed) { // 뒤집혀 있다면 xx, 카드 앞면이면 모양과 숫자보여주기.
			return "[XX]";
		} else {
			return String.format("[%c%s]", SUITS[suit], RANKS[rank]);
		}
	}
	@Override
	// rank값 만으로 같은 카드인지 확인하도록 구현한것
	public int hashCode() {
		return RANKS[rank].hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
	}

	public void toFrontSide() {
		this.reversed = false;
	}

	public void toBackSide() {
		this.reversed = true;
	}

	// 블랙젝 게임이 카드를 여러덱 섞으면서 하기 때문에, 아래 만든 getDeck()을 여러 카드덱를 섞을 수 있도록 만들어주는 것
	public static CardDeck getDeck(int deckSize) {
		List<Card> deck = new ArrayList<>();

		for (int i = 0; i < deckSize; ++i) {
			for (int suit = 0; suit < 4; ++suit) {
				for (int rank = 0; rank < 13; ++rank) {
					deck.add(new Card(suit, rank));
				}
			}
		}
		return new CardDeck(deck);
	}

	// List<Card> getDeck(){ 로 작성해서 주지말고, 한번 더 감싸서 주는게 좋을 것 같다 생각해야한다
	// CardDeck 이라는 파일을 만들어서 셔플과 맨 첫번째 카드를 꺼내서 준다던가 여러가지의 부분을 만들어서 전달해줘야한다.
	// CardDeck 블랙잭 메인 개발하는 개발자가 편하게 할 수 있도록 T-T
	public static CardDeck getDeck() {
		List<Card> deck = new ArrayList<>();

		for (int suit = 0; suit < 4; ++suit) {
			for (int rank = 0; rank < 13; ++rank) {
				// 덱에 모두 추가해주기
				deck.add(new Card(suit, rank));
			}
		}
		return new CardDeck(deck);
	}
	
	public int getRankValue() {
		return RANK_VALUES[rank];
	}

	// 열려있는 파일에서 Ctrl +F11 을 누르면 요 main이 시작 돌아가게되는 것
	public static void main(String[] args) {
//		System.out.println(new Card(0,0));
		// 모든 카드 하나씩 다 만들어볼 수 있다.
		for (int suit = 0; suit < 4; ++suit) {
			for (int rank = 0; rank < 13; ++rank) {
				System.out.println(new Card(suit, rank));
			}
		}
	}

}

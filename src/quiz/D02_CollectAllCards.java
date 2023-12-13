package quiz;

import java.util.HashSet;

import myobj.Card.CollectCard;

public class D02_CollectAllCards {
	
	/*
		카드를 랜덤으로 생성하여
		HashSet에 모든 종류의 카드를 추가 해보세요 (총 12개 추가해야함)
		
		1. 카드는 색상과 모양이 있다.
		색상 : 빨강, 파랑, 노랑, 초록
		모양 : 동그라미○, 세모△, 별☆ 
		
		2. 카드 클래스를 직접 생성하여 풀기
		
		3. 모든 종류의 카드를 HashSet에 추가한 후 모든 카드를 추가하기 위해 카드를 몇 번이나 생성 했는지 출력
	*/

	// 여기 card class는 선생님 설명~
	static class Card{
		private static String[] colors = {"red", "blue", "green", "yellow"};
		private static String[] shapes =  { "○", "☆", "△" };
		
		String color;
		String shape;
		
		public Card() {
			color = colors[(int)(Math.random() * colors.length)];
			shape = shapes[(int)(Math.random() * shapes.length)];
		}
		
		// hashSet에서 중복임을 알게됨
		@Override
		public boolean equals(Object obj) {
			return this.hashCode() == obj.hashCode();
			//return super.equals(obj);
			// 두 카드가 같은지볼께~
		}
		
		@Override
		public int hashCode() {
			return (color + shape).hashCode();
			// return super.hashCode();
			// 그 카드는 컬러랑 쉐이프가 더해진 모양이야~
		}
		
		@Override
		public String toString() {
			return "[" + color + " " + shape + "]";
		}
	}
	    
	public static void main(String[] args) {
		
		CollectCard card1 = new CollectCard();
		card1.print();
		
		System.out.println();
		System.out.println("선생님 해설 >>");
		Card c1 = new Card();
		System.out.println(c1);
		
		// 해당 클래스의 equls메서드 결과가 일치 한다면 중복으로 간주하고 Set에 추가되지 않는다.
		HashSet<Card> cards = new HashSet<>();
		
		int count =0;
		while (cards.size() < 12) {
			cards.add(new Card());
			System.out.println(++count + "번째 카드를 추가했습니다.");
		}
		System.out.println(cards);
		System.out.println("카드를" + count + "번 시도하여 모든 카드를 모았습니다.");
	}
	
}











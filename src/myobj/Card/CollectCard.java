package myobj.Card;

import java.util.HashSet;

public class CollectCard {

//	String color;
//	String shape;

	private static final String[] colors = { "빨강", "파랑", "노랑", "초록" };
	private static final String[] shapes = { "○", "☆", "△" };


	public CollectCard() {

	}

//	public CollectCard(String color, String shape) {
//		this.color = color;
//		this.shape = shape;
//	}

	public String getRandomCard() {
		
//		String[] color = { "빨강", "파랑", "노랑", "초록" };
//		String[] shape = { "○", "☆", "△" };
//
//		String randomColor = color[(int) (Math.random() * color.length)];
//		String randomShpae = shape[(int) (Math.random() * shape.length)];

		String randomColor = colors[(int) (Math.random() * colors.length)];
		String randomShpae = shapes[(int) (Math.random() * shapes.length)];

		return randomColor + randomShpae;
	}

	public void print() {
		HashSet<String> cardsOutput = new HashSet<>();

		int count = 0;
		while (cardsOutput.size() < 12) {
			String randomCard = getRandomCard();
			cardsOutput.add(randomCard);
			count++;
		}
		
		 System.out.println("카드 12개 생성에 " + count + "번 시도했습니다.");
	     System.out.println("생성된 카드: " + cardsOutput);

	}
}

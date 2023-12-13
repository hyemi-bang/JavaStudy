package myobj.prizeDraw;

public class Prize {

//	String name;
//	int amount;
//	double probability;

//	public Prize(String name, int amount, double probability) {
//		this.name = name;
//		this.amount = amount;
//		this.probability = probability;
//	}

	// 생성자: 경품의 이름, 수량, 확률을 초기화

	private String[] prizeNames = { "lg gram 15", "뮤지컬 R석 티켓 2장", "공기청정기", "스타벅스 아메리카노 상품권" };
	private int[] prizeAmounts = { 8, 20, 2, 50 };

	protected static double probability() {
		return Math.random(); // 0에서 1사이의 랜덤한 확률 값을 반환
	}

	
	
	public String Random() {

		// 4개의 물건에 확률 부과
		double randomValue = probability();
		// 수량이 모두 소진된 상품은 더 이상 당첨될 수 없다??
		if (prizeAmounts[prizeAmounts.length - 1] <= 0) {
			return "꽝, 아쉽지만 다음 기회를 노려주세요~";
		} else {
			if (randomValue < 0.3 && prizeAmounts[0] > 0) {
				prizeAmounts[0]--;
				return prizeNames[0] + "\n남은 경품수 : " + prizeAmounts[0]; // 30% 확률의 상품 추첨
			} else if (randomValue < 0.5 && prizeAmounts[1] > 0) {
				prizeAmounts[1]--;
				return prizeNames[1] + "\n남은 경품수 : " + prizeAmounts[1]; // 20% 확률의 상품 추첨
			} else if (randomValue < 0.6 && prizeAmounts[2] > 0) {
				prizeAmounts[2]--;
				return prizeNames[2] + "\n남은 경품수 : " + prizeAmounts[2]; // 10% 확률의 상품 추첨
			} else if (randomValue < 0.8 && prizeAmounts[3] > 0) {
				prizeAmounts[3]--;
				return prizeNames[3] + "\n남은 경품수 : " + prizeAmounts[3]; // 50% 확률의 상품 추첨
			} else {

				return "꽝 아쉽지만 다음 기회를 노려주세요~";
			}

		}

	}
}

/*
 	 	Prize g1 = new Prize("lg gram 15", 2, 0.3);
		Prize g2 = new Prize("공기청정기", 1, 0.2);
		Prize g3 = new Prize("뮤지컬 R석 티켓 2장", 15, 0.1);
		Prize g4 = new Prize("스타벅스 아메리카노 상품권", 100, 0.4);
		
		
		Prize g1 = new Prize();
		System.out.println("당첨된 경품: " + g1.Random());
		
 */
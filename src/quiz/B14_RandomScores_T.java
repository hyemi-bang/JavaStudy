package quiz;

public class B14_RandomScores_T {

	public static void main(String[] args) {

		int[] scores = new int[300];
		// 0 ~ 299번 방까지 숫자를 랜덤으로 채운다
		for (int i = 0; i < scores.length; ++i) {
			scores[i] = (int)(Math.random() * 20001);
		}

		int sum = 0;
		for (int i = 0; i < scores.length; ++i) {
			sum += scores[i];
			System.out.print(scores[i] + "\t");
			if (i % 5 == 4) { // i는 0~4까지 총 5개 임으로.
				System.out.println();
			}
		}
		System.out.println("----------------------------------------");
		System.out.println("총합: " + sum);
		System.out.printf("평균:%.2f점\n" ,  sum / (double)scores.length);

		// 제일 높은 점수와 제일 낮은 점수
		// 첫번째 점수로 초기화 해놓고 두번째 점수부터 하나씩 비교한다
		int bestScore = scores[1];
		int worstScore = scores[1];

		for (int i = 1; i < scores.length; ++i) {
			// 현재의 최고 점수보다 i번째 점수가 더 크다면 그 점수를 최고 점수로 바꾼다.
			if (scores[i] > bestScore) {
				bestScore = scores[i];
			}
			// 현재의 최저 점수보다 i번째 점수가 더 작다면 그 점수를 최저 점수로 바꾼다.
			if (scores[i] < worstScore) {
				worstScore = scores[i];
			}
		}
		System.out.println("최고점수:" + bestScore);
		// 최고점수 모두 출력
		for (int i =0 ; i <scores.length; ++i) {
			int score = scores[i];
			if (score == bestScore) {
				System.out.printf("%d번째 참가자 [%d점]\n", i , score);
			}
		}

		System.out.println("최저점수:" + worstScore);
		// 최저점수 모두 출력
		for (int i =0 ; i < scores.length; ++i) {
			int score = scores[i];
			if (score == worstScore) {
				System.out.printf("%d번째 참가자 [%d점]\n", i , score);
			}
		}
	}

}

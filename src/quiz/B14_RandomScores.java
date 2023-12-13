package quiz;

import java.util.Random;

public class B14_RandomScores {

	/*
	 1. 300개의 랜덤 점수 생성 (0~20000) 
	 2. 해당 점수들을 한 줄에 5개씩 보기 좋게 출력 
	 3. 모든 점수들의 평균을 출력 (소수 셋째자리에서 반올림) 
	 4. 가장 높은 점수와 가장 낮은 점수를 찾아 해당 점수와 몇 번째 사람인지 출력
	 */

	public static void main(String[] args) {
		Random ran = new Random();
		int[] scores = new int[300];
		int count = 0;
		int sum = 0;
		int max = 0, min = 0;

		// 0 ~ 299번 방까지 숫자를 랜덤으로 채운다
		for (int i = 0; i < scores.length; ++i) {
			scores[i] = ran.nextInt(20001);
			System.out.print(scores[i] + " ");
			if (++count % 5 == 0) {
				System.out.println();
				continue;
			}
			sum += scores[i];

		}
		System.out.println();
		System.out.println("모든 숫자의 합 : " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("평균 :" + Math.round((avg) * 1000) / 1000.0);
		System.out.println();

		for (int i = 1; i < scores.length; ++i) {
			if (max < scores[i]) {
				max = scores[i];
			}
			if(min > scores[i]) {
				min = scores[i];
			}
		}
		System.out.println("가장 높은 점수 :" + max);
		System.out.println("가장 낮은 점수 :" + min);

	}

}

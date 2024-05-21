package coding_quiz;

import java.util.Scanner;

public class Q1546 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		double[] scores = new double[num];
		
		for(int i = 0; i < num ; i++) {
			scores[i] = sc.nextDouble();
		}
		
		double maxScore = 0;
		for(int i = 0; i < num; i++) {
			if(scores[i] > maxScore) {
				maxScore = scores[i];
			}
		}
		
		double sum = 0;
		for(int i = 0 ; i < num; i++) {
			scores[i] = (scores[i] / maxScore) * 100;
			//System.out.printf("최대값 %s : 현재 maxScore %s \n", maxScore, scores[i]);
			sum += scores[i];
			//System.out.println("합계"+ sum);
		}
		
		double newAvg = sum / num;
		System.out.println(newAvg);
	}

}

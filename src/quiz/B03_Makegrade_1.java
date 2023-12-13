package quiz;

import java.util.Scanner;

public class B03_Makegrade_1 {
	public static void main(String[] args) {
		/*
		 * 국어, 영어, 수학 점수를 순서대로 입력받아, 평균점수를 구한 후에 각 과목의 점수와 등급,
		   평균점수를 출력해주는 프로그램을만들어보세요
		  > 평균점수 : (국어+영어+수학)/3 
		   90점 이상 A / 80점 이상 B / 70점 이상 C / 60점 이상 D / 그 외 F 각 과목의
		 * 유효점수는 0~100점. 유효하지 않은 점수가 하나라도 있다면 모든 과목이 F이고 평균점수는 0점
		  > (int)Math.ceil(); 
		 * 점수는 소수 둘째 자리에서 반올림 하여 변수에 저장한 후 츌력
		  > Math.round((avg*10)/10);
 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("국어 점수를 입력해주세요.");
		int korCount = sc.nextInt();
		System.out.print("영어 점수를 입력해주세요.");
		int engCount = sc.nextInt();
		System.out.print("수학 점수를 입력해주세요.");
		int mathCount = sc.nextInt();


		int totalPrice = korCount + engCount + mathCount;
		double avg_round = Math.round((totalPrice / 3) * 10) / 10;
		char korGarde, engGrade,mathGrade;
		
		String format = "국어점수 - %d점\n"
				  + "영어점수 - %d점\n"
				  + "수학점수 - %d점\n"
				  + "-------------\n"
				  + "총합\t%d\n";


		System.out.printf(format, korCount, engCount, mathCount, totalPrice);

		if (90 <= avg_round && avg_round < 100) {
			System.out.printf("평균점수는 %.2f이고, 등급은 A입니다.\n", avg_round);
		} else if (80 <= avg_round && avg_round < 90) {
			System.out.printf("평균점수는 %.2f이고, 등급은 B입니다.\n", avg_round);
		} else if (70 <= avg_round && avg_round < 80) {
			System.out.printf("평균점수는 %.2f이고, 등급은 C입니다.\n", avg_round);
		} else if (60 <= avg_round && avg_round < 70) {
			System.out.printf("평균점수는 %.2f이고, 등급은 D입니다.\n", avg_round);
		} else if (avg_round < 60 && avg_round>0) {
			System.out.printf("평균점수는 %.2f이고, 등급은 F입니다.\n", avg_round);
		} else { 
			System.out.println("유효하지 않은 점수를 입력하였습니다. 평균점수 : 0 + 등급 : F");
		}

	}

//	boolean A = (90 <= avg_round && avg_round<100);
//	boolean B = (80 <= avg_round && avg_round<90);
//	boolean C = (70 <= avg_round && avg_round<80);
//	boolean D = (60 <= avg_round && avg_round<70);
//	boolean F = avg_round<60;

}

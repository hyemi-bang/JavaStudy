package quiz;

import java.util.Scanner;

public class B03_MakeGrade_2 { // 선생님 풀이
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력 >");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력 >");
		int eng = sc.nextInt();
		System.out.println("수학 점수 입력 >");
		int math = sc.nextInt();
		char korGarde, engGrade,mathGrade;
		double avg;
		
		//유효점수 체크, 유효성 체크
		if(kor>100 || kor<0 || eng>100 || eng<0 || math >100 || math<0) {
//			System.out.println("\t점수\t등급");
//			System.out.println("국어점수\t0\tF");
//			System.out.println("영어점수\t0\tF");
//			System.out.println("수학점수\t0\tF");
//			System.out.println("====================");
//			System.out.println("평균\t\t0.0");	
			kor =0; eng=0; math=0;
			korGarde=0; engGrade=0;mathGrade=0;
			avg=0.0;
			// 그냥 0점/ F등급으로 처리하고, 맨 아래쪽에서 한번에 결과출력하려면 하는 방법
			
		} else {	// 점수가 모두 유효한 곳
			
			//각 과목 등급 만들기			
			if(kor>=90) {
				korGarde = 'A';
			} else if (kor>=80) {
				korGarde = 'B';
			} else if (kor>=70) {
				korGarde = 'C';
			} else if (kor>=60) {
				korGarde = 'D';
			} else  {
				korGarde = 'F';
			} 
			if(eng>=90) {
				engGrade = 'A';
			} else if (eng>=80) {
				engGrade = 'B';
			} else if (eng>=70) {
				engGrade = 'C';
			} else if (eng>=60) {
				engGrade = 'D';
			} else  {
				engGrade = 'F';
			} 
			
			if(math>=90) {
				mathGrade = 'A';
			} else if (math>=80) {
				mathGrade = 'B';
			} else if (math>=70) {
				mathGrade = 'C';
			} else if (math>=60) {
				mathGrade = 'D';
			} else  {
				mathGrade = 'F';
			 }
			
			avg = Math.round((kor+eng+math)/3.0*10)/10.0;
			
//			System.out.println("\t점수\t등급");
//			System.out.printf("국어점수\t%d\t%c\n", math, mathGrade);
//			System.out.printf("영어점수\t%d\t%c\n",eng,engGrade);
//			System.out.printf("수학점수\t%d\t%c\n",kor,korGarde);
//			System.out.println("====================");
//			System.out.printf("평균\t\t%01f\n", avg);		
//			
	} 
		//계산된 결과를 출력하기 
		System.out.println("\t점수\t등급");
		System.out.printf("국어점수\t%d\t%c\n", math, mathGrade);
		System.out.printf("영어점수\t%d\t%c\n",eng,engGrade);
		System.out.printf("수학점수\t%d\t%c\n",kor,korGarde);
		System.out.println("====================");
		System.out.printf("평균\t\t%01f\n", avg);					
		} 
}
	
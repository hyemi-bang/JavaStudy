package quiz;

import java.util.Scanner;

public class B00_DollarSwap {

	public static void main(String[] args) {
	
		/*
		  원화 -> 현재 환율로 몇 달러 인지 알려주는 프로그램을 만들어보세요.
		  현재 환율 : 검색 <1,331.00> , 소수점 2자리까지 나오도록		  
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력 하세요. :");
		
		int koreanwon = sc.nextInt(); // -> krw
		double exchange = 0.00075; // -> exchange_rate
		double dollar = koreanwon * exchange; //dollar -> usd
		
		System.out.printf("%dKRW는 %.2fUSD입니다\n", koreanwon , dollar );
		

	}

}

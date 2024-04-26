package baekjoon_ac;

import java.util.Scanner;

public class Q2525 {
	/*
	 첫째줄 현재 시각은 시 A(0 ≤ A ≤ 23) 와 분 B(0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다.
	 두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.
	
	첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다. 
	단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다.
	디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.
	
	14 30   => 14 50 출력   17 40   => 19 0 출력
    20					   80
	
	*/
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int min = sc.nextInt();
		int cooking = sc.nextInt();
		
		int totalMinutes = hour * 60 + min + cooking;
		
		int endHour = (totalMinutes / 60) % 24;
		int endMin =  totalMinutes % 60;
		
		System.out.println(endHour + " " + endMin);
		
//		if(hour < 23) {
//			if(min+cooking >= 60) {
//				System.out.println((hour+((min+cooking)/60))+" "+((min+cooking)%60));
//			}
//		}		
//		if(hour >= 23) {
//			System.out.println((((min+cooking)/60)-1)+" "+((min+cooking)%60));
//		} else {
//			System.out.println(hour+" "+(min+cooking));
//		}

//		int endTime = hour * 60 + min + cooking;
//
//		int endHour = endTime / 60;
//		if (endHour >= 24) {
//			endHour %= 24;
//		}
//		System.out.println( endTime / 60);  >>> 풀리지 않음
	}

}

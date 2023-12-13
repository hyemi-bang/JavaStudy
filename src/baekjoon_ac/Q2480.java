package baekjoon_ac;

import java.util.Scanner;
/*
	 3개의 주사위를 던져 규칙에 따라 상금을 받는 게임
	 1> 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
	 2> 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
	 3> 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
	 
	 3 3 6 => 1300
	 2 2 2 => 12000
	 6 2 5 => 600
*/

public class Q2480 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a == b && b == c) {
			System.out.println(10000 + a * 1000);
		} else {
			if (a == b) {
				System.out.println(1000 + a * 100);
			} else if (b == c) {
				System.out.println(1000 + b * 100);
			} else if (a == c) {
				System.out.println(1000 + c * 100);
			} else {
				int max = a;
				if(max < b) {
					max = b;
				}
				if(max < c) {
					max = c;
				}
			
				System.out.println(100 * max);
			}
		}

	}
}
package baekjoon_ac;

import java.util.Scanner;

public class Q10950 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt(); // 테스트 케이스 t개 주어진다
		
		// 테스트 a,b 가 주어진다  (0 < A, B < 10)
		// 테스트 케이스도 sc.nextInt로 받아야하고, 개수는 테스트 케이스 만큼이다
		
		int[] a = new int[testCase];
		int[] b = new int[testCase]; 
		
		for(int i = 0 ; i < testCase ; ++i) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		// 츨력 입력받은 a와b를 더해라
		for(int i = 0 ; i < testCase; ++i) {
			System.out.println(a[i]+b[i]);
		}
		
	}

}

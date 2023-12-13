package baekjoon_ac;

import java.util.Scanner;

public class Q25304 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int receipt = sc.nextInt(); // 영수증금액
		int count = sc.nextInt(); // 물건 종류 수

		int total = 0;
		for (int i = 0; i < count; i++) {
			// 금액a와 갯수b를 입력 받고 출력해준다
			int a = sc.nextInt();
			int b = sc.nextInt();

			// a와 b를 곱한 값을 total 변수에 저장해주고 반복되어지는 total 값을 더해준다
			total = (total + (a * b));
		}

		if (total == receipt) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}

//int buycount = 0; // 각 구매한 개수
//for (int i = 0; i < buycount; ++i) {
//	int[] a = new int[i];
//	a[i] =sc.nextInt();
//}
//for (int i = 0; i < buycount; ++i) {
//	int[] b = new int[i];
//	b[i] =sc.nextInt();
//}
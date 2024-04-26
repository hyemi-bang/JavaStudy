package baekjoon_ac;

import java.util.Scanner;

public class Q8393 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// n값이 주어지면, 1부터 n까지 합을 출력하라
		//
		int sum = 0;
		for (int i = 1; i <= n; ++i) {
			sum += i;

		}
		System.out.println(sum);
	}

}

package baekjoon_ac;

import java.util.Scanner;

public class Q2480_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		int s = sc.nextInt();
		int t = sc.nextInt();

		int price = 0;

		if (f == s && f == t) {
			price = 10000 + f * 1000;
		} else if (f != s && f != t && s != t) {
			int max = Math.max(Math.max(f, s), t);
			price = max * 100;
		} else {
			int maxx = f == s || f == t ? f : s;
			price = 1000 + maxx * 100;
		}

		System.out.println(price);
	}
}
